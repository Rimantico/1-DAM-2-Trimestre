package prog.unidad06.re.ejercicio01;

/**
 * Usuario del sistema
 */
public class Usuario {
  
  // Atributos
  private String nombre;
  private String telefono;
  private String codigoPostal;
  private String usuario;
  private String password;

  /**
   * Crea un nuevo usuario
   * @param nombre Nombre completo del usuario. No puede ser vacío o null y
   *   sólo puede constar de letras españolas, espacios y guión. La longitud
   *   máxima es de 100 caracteres y cada parte debe comenzar con mayúscula
   * @param telefono Teléfono del usuario. No puede ser null. Debe constar de
   *   9 dígitos comenzando por 6, 7, 8 ó 9.
   * @param codigoPostal Código postal. No puede ser null. Debe constar de 5
   *   dígitos y los dos primeros deben estar comprendidos entre 01 y 52, ambos
   *   incluidos
   * @param usuario Nombre de usuario. No puede ser null. Debe constar de
   *   entre 1 y 10 caracteres, que deben ser letras (inglesas, mayúsculas o
   *   minúsculas), dígitos o el caracter barra baja (_) y debe comenzar por
   *   letra
   * @param password Contraseña. No puede ser null. Debe constar de entre 8
   *   y 16 caracteres y sólo puede contener letras inglesas (mayúsculas o
   *   minúsculas), dígitos y uno de los siguientes caracteres especiales:
   *   <ul>
   *     <li>Punto (.)</li>
   *     <li>Punto y coma(;)</li>
   *     <li>Coma (,)</li>
   *     <li>Dos puntos (:)</li>
   *     <li>Barra (/)</li>
   *     <li>Asterisco (*)</li>
   *     <li>Ampersand (&amp;)</li>
   *     <li>Porcentaje (%)</li>
   *     <li>Dolar ($)</li>
   *     <li>Paréntesis de apertura o cierre ()</li>
   *   </ul><br>
   *   Es obligatorio que la contraseña contenga al menos una letra
   *   mayúscula, una minúscula, un dígito y un carácter especial
   * @throws IllegalArgumentException Si alguno de los parámetros no es correcto
   */
  public Usuario(String nombre, String telefono, String codigoPostal,
    String usuario, String password) {
    setNombre(nombre);
    setTelefono(telefono);
    setCodigoPostal(codigoPostal);
    setUsuario(usuario);
    setPassword(password);
  }

  /**
   * Obtiene el nombre completo del usuario
   * @return Nombre completo del usuario
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Modifica el nombre completo del usuario<br>
   * No puede ser vacío o null y sólo puede constar de letras españolas
   *   espacios y guión. La longitud máxima es de 100 caracteres y cada
   *   parte debe comenzar con mayúscula
   * @param nombre Nuevo valor del nombre
   * @throws IllegalArgumentException Si el nuevo nombre no es correcto
   */
  public void setNombre(String nombre) {
    // Si no es null
    if (nombre != null) {
      // Si la longitud es correcta
      if (nombre.length() > 0 && nombre.length() <= 100) {
        // Comprueba que los caracteres son correctos
        if (nombre.matches("[A-ZÑa-zñ -]+")) {
          // Divide el nombre en partes usando split
          String[] partes = nombre.split("( |-)+");
          // Para cada parte
          for (String parte: partes) {
            // Debe constar de sólo letras y la primera mayúscula
            if (!parte.matches("[A-ZÑ][A-ZÑa-zñ]*")) {
              // Error
              throw new IllegalArgumentException();
            }
          }
          // Si llega aqui el nombre es correcto
          this.nombre = nombre;
        } else {
          // El nombre contiene caracteres incorrectos
          throw new IllegalArgumentException();
        }
      } else {
        // Longitud incorrecta
        throw new IllegalArgumentException();
      }
    } else {
      // El nombre es null
      throw new IllegalArgumentException();
    }
  }

  /**
   * Obtiene el telefono
   * @return Teléfono del usuario
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * Modifica el teléfono del usuario<br>
   * No puede ser null y debe constar de 9 dígitos comenzando por 6, 7, 8 ó 9.
   * @param telefono Nuevo teléfono
   * @throws IllegalArgumentException Si el telefono no es correcto
   */
  public void setTelefono(String telefono) {
    // Si el telefono no es null
    if (telefono != null) {
      // Comprueba que tiene el formato correcto
      if (telefono.matches("[6-9]\\d{8}")) {
        // Actualiza el telefono
        this.telefono = telefono;
      } else {
        // Formato incorrecto
        throw new IllegalArgumentException();
      }
    } else {
      // telefono es null
      throw new IllegalArgumentException();
    }
  }

  /**
   * Obtiene el código postal
   * @return Código postal del usuario
   */
  public String getCodigoPostal() {
    return codigoPostal;
  }

  /**
   * Modifica el código postal del usuario<br>
   * No puede ser null. Debe constar de 5 dígitos y los dos primeros deben
   * estar comprendidos entre 01 y 52, ambos incluidos
   * @param codigoPostal Nuevo codigo postal
   * @throws IllegalArgumentException Si el código postal no es correcto
   */
  public void setCodigoPostal(String codigoPostal) {
    // Si no es null
    if (codigoPostal != null) {
      // Si cumple el patron
      if (codigoPostal.matches("((0[1-9])|([1-4][0-9])|(5[0-2]))[0-9]{3}")) {
        // Almacena el nuevo codigo postal
        this.codigoPostal = codigoPostal;
      } else {
        // Lanza excepcion
        throw new IllegalArgumentException();
      }
    } else {
      // Codigo es null
      throw new IllegalArgumentException();
    }
  }

  /**
   * Obtiene el nombre de usuario del usuario
   * @return Nombre de usuario del usuario
   */
  public String getUsuario() {
    return usuario;
  }

  /**
   * Modifica el nombre de usuario del usuario<br>
   * No puede ser null. Debe constar de entre 1 y 10 caracteres, que deben ser
   * letras (inglesas, mayúsculas o minúsculas), dígitos o el caracter barra
   * baja (_) y debe comenzar por letra
   * @param usuario Nuevo nombre de usuario
   * @throws IllegalArgumentException Si el usuario no es correcto
   */
  public void setUsuario(String usuario) {
    // Si no es null
    if (usuario != null) {
      // Si cumple el patron
      if (usuario.matches("[A-Za-z][A-Za-z0-9_]{0,9}")) {
        // Almacena el nuevo usuario
        this.usuario = usuario;
      } else {
        // Lanza excepcion
        throw new IllegalArgumentException();
      }
    } else {
      // Usuario es null
      throw new IllegalArgumentException();
    }
  }

  /**
   * Obtiene la password
   * @return Password del usuario
   */
  public String getPassword() {
    return password;
  }

  /**
   * Modifica la password del usuario<br>
   * No puede ser null. Debe constar de entre 8
   *   y 16 caracteres y sólo puede contener letras inglesas (mayúsculas o
   *   minúsculas), dígitos y uno de los siguientes caracteres especiales:
   *   <ul>
   *     <li>Punto (.)</li>
   *     <li>Punto y coma(;)</li>
   *     <li>Coma (,)</li>
   *     <li>Dos puntos (:)</li>
   *     <li>Barra (/)</li>
   *     <li>Asterisco (*)</li>
   *     <li>Ampersand (&amp;)</li>
   *     <li>Porcentaje (%)</li>
   *     <li>Dolar ($)</li>
   *     <li>Paréntesis de apertura o cierre ()</li>
   *   </ul><br>
   *   Es obligatorio que la contraseña contenga al menos una letra
   *   mayúscula, una minúscula, un dígito y un carácter especial
   * @param password Nueva contraseña del usuario
   * @throws IllegalArgumentException Si la passowrd no es correcta
   */
  public void setPassword(String password) {
    // Si no es null
    if (password != null) {
      // Si contiene los caracteres correctos y la longitud adecuada
      if (password.matches("[A-Za-z0-9.;,:/*&%$()]{8,16}")) {
        // Si contiene al menos una mayúscula, una minúscula, un número y
        // un carácter especial
        if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")
          && password.matches(".*[0-9].*") && password.matches(".*[.;,:/*&%$()].*")) {
          // Almacena la nueva contraseña
          this.password = password;
        } else {
          // No contiene al menos uno de los caracteres requeridos
          throw new IllegalArgumentException();
        }
      } else {
        // Lanza excepcion
        throw new IllegalArgumentException();
      }
    } else {
      // Usuario es null
      throw new IllegalArgumentException();
    }
  }
  
  
}
