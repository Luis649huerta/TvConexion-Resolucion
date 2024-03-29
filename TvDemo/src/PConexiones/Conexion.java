package PConexiones;



/**
 * Class Wifi
 */
public class Conexion {

  //
  // Fields
  //

  private String SSID;
  private String clave;
  private String usuario;
  
  //
  // Constructors
  //
  //Herrera improvement public Wifi () { };
  /**
   * 
   * @param SSID
   * @param usuario 
   */
  public Conexion(String SSID, String usuario) {
    this.SSID = SSID;
    this.usuario = usuario;
  }
  public Conexion(){}
 /**
 * 
 * @param SSID
 * @param clave
 * @param usuario 
 */
 public Conexion(String SSID, String clave, String usuario) {
    this.SSID = SSID;
    this.clave = clave;
    this.usuario = usuario;
 }

  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Fija el valor de SSID
   * @param newVar el nuevo valor de SSID
   */
  public void setSSID ( String newVar ) {
    SSID = newVar;
  }

  /**
   * Devuelve el valor de SSID
   * @return el valor de SSID
   */
  public String getSSID ( ) {
    return SSID;
  }

  /**
   * Fija el valor de clave
   * @param newVar el nuevo valor de clave
   */
  public void setClave ( String newVar ) {
    clave = newVar;
  }

  /**
   * Devuelve el valor de clave
   * @return el valor de clave
   */
  public String getClave ( ) {
    return clave;
  }

  /**
   * Fija el valor de usuario
   * @param newVar el nuevo valor de usuario
   */
  public void setUsuario ( String newVar ) {
    usuario = newVar;
  }

  /**
   * Devuelve el valor de usuario
   * @return el valor de usuario
   */
  public String getUsuario ( ) {
    return usuario;
  }

  //
  // Other methods
  //

}
