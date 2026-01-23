# Configuración de GitHub Actions para Maven Central

Este documento describe cómo configurar los secretos necesarios en GitHub para publicar automáticamente tu librería en Maven Central.

## Secretos Requeridos

Debes configurar los siguientes secretos en tu repositorio de GitHub:

### 1. GPG_PRIVATE_KEY

Tu clave privada GPG en formato ASCII armored.

**Cómo obtenerla:**

```bash
# Listar tus claves GPG
gpg --list-secret-keys --keyid-format LONG

# Exportar la clave privada (reemplaza KEY_ID con tu ID de clave)
gpg --armor --export-secret-keys KEY_ID
```

Copia todo el contenido, incluyendo las líneas `-----BEGIN PGP PRIVATE KEY BLOCK-----` y `-----END PGP PRIVATE KEY BLOCK-----`.

### 2. GPG_PASSPHRASE

La contraseña de tu clave GPG.

### 3. GPG_KEY_ID

El ID de tu clave GPG (los últimos 16 caracteres del fingerprint).

**Ejemplo:** Si tu fingerprint es `4523290E04150DD7`, ese es tu KEY_ID.

### 4. MAVEN_CENTRAL_USERNAME

Tu nombre de usuario de Sonatype OSSRH o Maven Central.

- Para el nuevo portal de Maven Central: usa tu token de usuario
- Para OSSRH legacy: usa tu nombre de usuario de Jira

### 5. MAVEN_CENTRAL_TOKEN

Tu token de acceso de Maven Central.

**Cómo obtenerlo:**

1. Ve a https://central.sonatype.com/
2. Inicia sesión con tu cuenta
3. Ve a tu perfil → "Generate User Token"
4. Copia el token generado

## Configurar los Secretos en GitHub

1. Ve a tu repositorio en GitHub
2. Haz clic en **Settings** → **Secrets and variables** → **Actions**
3. Haz clic en **New repository secret**
4. Agrega cada uno de los secretos mencionados arriba

## Cómo Funciona el Workflow

El workflow se ejecuta automáticamente cuando:

1. **Creas un tag con formato `v*`** (ejemplo: `v0.3.9`, `v1.0.0`)
   ```bash
   git tag v0.3.9
   git push origin v0.3.9
   ```

2. **Manualmente** desde la pestaña "Actions" en GitHub (workflow_dispatch)

### Proceso de Publicación

1. Checkout del código
2. Configuración de JDK 8
3. Importación de la clave GPG
4. Configuración de credenciales de Maven
5. Build y deploy a Maven Central
6. Creación de GitHub Release con los artefactos

## Verificación

Después de que el workflow se ejecute exitosamente:

1. Verifica en https://central.sonatype.com/ que tu artefacto fue publicado
2. Los artefactos estarán disponibles en Maven Central en unos minutos
3. Se creará automáticamente un GitHub Release con los JARs

## Notas Importantes

- El workflow usa Java 8 (compatible con tu configuración actual)
- Los tests se omiten durante el deploy (`-DskipTests`)
- La firma GPG se realiza automáticamente durante el build
- El workflow crea un GitHub Release automáticamente con los artefactos generados

## Solución de Problemas

### Error: "gpg: signing failed: Inappropriate ioctl for device"

Esto ya está resuelto con la configuración `--pinentry-mode loopback` en el pom.xml.

### Error: "401 Unauthorized"

Verifica que tus credenciales de Maven Central sean correctas y que el token no haya expirado.

### Error: "No secret key"

Asegúrate de que el `GPG_KEY_ID` coincida exactamente con el ID de la clave que exportaste.

## Ejemplo de Uso

```bash
# 1. Actualiza la versión en pom.xml
# 2. Commit los cambios
git add pom.xml
git commit -m "Release version 0.3.9"

# 3. Crea y pushea el tag
git tag v0.3.9
git push origin main
git push origin v0.3.9

# 4. El workflow se ejecutará automáticamente
```

## Recursos Adicionales

- [Maven Central Publishing Documentation](https://central.sonatype.org/publish/publish-guide/)
- [GPG Key Generation](https://central.sonatype.org/publish/requirements/gpg/)
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
