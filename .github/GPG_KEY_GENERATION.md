# Guía para Generar Claves GPG en Linux

Esta guía te ayudará a generar nuevas claves GPG en tu sistema Linux para firmar tus artefactos de Maven.

## Paso 1: Verificar si GPG está instalado

```bash
gpg --version
```

Si no está instalado:
```bash
# Ubuntu/Debian
sudo apt-get install gnupg

# Fedora/RHEL
sudo dnf install gnupg

# Arch Linux
sudo pacman -S gnupg
```

## Paso 2: Generar una nueva clave GPG

```bash
gpg --full-generate-key
```

### Opciones recomendadas:

1. **Tipo de clave**: Selecciona `(1) RSA and RSA (default)`
2. **Tamaño de clave**: `4096` bits (más seguro)
3. **Validez**: `0` (no expira) o el tiempo que prefieras
4. **Nombre real**: Tu nombre completo (ejemplo: `Alex Tumiri Huanca`)
5. **Email**: Tu email (debe coincidir con el de Maven Central: `alextumirihuanca@gmail.com`)
6. **Comentario**: Opcional (ejemplo: `Morphoide Library`)
7. **Passphrase**: Crea una contraseña segura (la necesitarás después)

## Paso 3: Listar tus claves GPG

```bash
gpg --list-secret-keys --keyid-format LONG
```

Verás algo como:
```
sec   rsa4096/4523290E04150DD7 2026-01-23 [SC]
      ABCD1234EFGH5678IJKL9012MNOP3456QRST7890
uid                 [ultimate] Alex Tumiri Huanca <alextumirihuanca@gmail.com>
ssb   rsa4096/1234567890ABCDEF 2026-01-23 [E]
```

**Tu GPG_KEY_ID es**: `4523290E04150DD7` (los 16 caracteres después de `rsa4096/`)

## Paso 4: Exportar la clave privada

```bash
# Reemplaza 4523290E04150DD7 con tu KEY_ID real
gpg --armor --export-secret-keys 4523290E04150DD7
```

Esto mostrará algo como:
```
-----BEGIN PGP PRIVATE KEY BLOCK-----

lQdGBGXxxx...
[muchas líneas de texto]
...xxxxx==
-----END PGP PRIVATE KEY BLOCK-----
```

**Copia TODO este contenido** (incluyendo las líneas BEGIN y END). Este es tu `GPG_PRIVATE_KEY`.

## Paso 5: Publicar tu clave pública en servidores de claves

Maven Central requiere que tu clave pública esté disponible en servidores de claves:

```bash
# Reemplaza 4523290E04150DD7 con tu KEY_ID
gpg --keyserver keyserver.ubuntu.com --send-keys 4523290E04150DD7
gpg --keyserver keys.openpgp.org --send-keys 4523290E04150DD7
gpg --keyserver pgp.mit.edu --send-keys 4523290E04150DD7
```

**IMPORTANTE**: Espera unos minutos para que las claves se sincronicen entre servidores.

## Paso 6: Verificar que la clave fue publicada

```bash
# Reemplaza 4523290E04150DD7 con tu KEY_ID
gpg --keyserver keyserver.ubuntu.com --recv-keys 4523290E04150DD7
```

## Resumen de los Secretos para GitHub

Después de completar estos pasos, tendrás:

1. **GPG_PRIVATE_KEY**: La salida completa del comando `gpg --armor --export-secret-keys`
2. **GPG_PASSPHRASE**: La contraseña que creaste en el Paso 2
3. **GPG_KEY_ID**: Los 16 caracteres después de `rsa4096/` (ejemplo: `4523290E04150DD7`)
4. **MAVEN_CENTRAL_USERNAME**: Tu usuario de Maven Central
5. **MAVEN_CENTRAL_TOKEN**: Tu token de Maven Central (obtenerlo en https://central.sonatype.com/)

## Comandos Rápidos de Referencia

```bash
# Listar claves
gpg --list-keys
gpg --list-secret-keys --keyid-format LONG

# Exportar clave pública
gpg --armor --export 4523290E04150DD7

# Exportar clave privada
gpg --armor --export-secret-keys 4523290E04150DD7

# Eliminar una clave (si necesitas empezar de nuevo)
gpg --delete-secret-keys 4523290E04150DD7
gpg --delete-keys 4523290E04150DD7

# Publicar en servidores de claves
gpg --keyserver keyserver.ubuntu.com --send-keys 4523290E04150DD7
```

## Notas Importantes

- **Guarda tu passphrase de forma segura**: Sin ella no podrás usar tu clave privada
- **Haz backup de tu clave privada**: Guárdala en un lugar seguro
- **No compartas tu clave privada**: Solo la clave pública debe ser pública
- **El email debe coincidir**: Usa el mismo email que en tu cuenta de Maven Central

## Solución de Problemas

### Error: "gpg: agent_genkey failed: No such file or directory"

```bash
# Reinicia el agente GPG
gpgconf --kill gpg-agent
gpg-agent --daemon
```

### Error: "gpg: keyserver send failed: No route to host"

Prueba con otro servidor de claves o verifica tu conexión a internet.

### ¿Olvidaste tu KEY_ID?

```bash
gpg --list-secret-keys --keyid-format LONG
```

## Siguiente Paso

Una vez que tengas todos los secretos, ve a tu repositorio en GitHub:

1. **Settings** → **Secrets and variables** → **Actions**
2. Agrega los 5 secretos mencionados arriba
3. Actualiza la versión en `pom.xml` a `0.3.9`
4. Crea un tag y haz push para activar el workflow

```bash
git add .
git commit -m "Release version 0.3.9"
git tag v0.3.9
git push origin main
git push origin v0.3.9
```
