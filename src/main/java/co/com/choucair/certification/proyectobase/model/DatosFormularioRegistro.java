package co.com.choucair.certification.proyectobase.model;
/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde se capturan los datos de la userinterface/formulario de registro
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
public class DatosFormularioRegistro
{
    //Atributos interfaz datos formulario registro de usuario
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    //Atributos interfaz direccion de usuario
    private String city;
    private String postalCode;
    private String country;
    //Atributos interfaz dispositivos
    private String computer;
    private String version;
    private String language;
    private String mobileDevice;
    private String model;
    private String operatingSystem;
    //Atributos interfaz ultimo paso
    private String password;
    private String confirmPassword;
    //Atributo question registro exitoso
    private String exit;
    /**
     * Metodo que me obtiene el texto boton complete setup ingresada por el usuario
     * @return
     */
    public String getExit() {
        return exit;
    }
    /**
     * Metodo que me fija/edita el texto boton complete setup ingresada por el usuario
     * @param exit
     */
    public void setExit(String exit) {
        this.exit = exit;
    }

    /**
     * Metodo que me obtiene la contrasenia  ingresada por el usuario
     * @return
     */
    public String getPassword() {
        return password;
    }
    /**
     * Metodo que me fija/edita la contrasenia ingresada por el usuario
     * @param confirmPassword
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Metodo que me obtiene la contrasenia confirmada ingresada por el usuario
     * @return
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }
    /**
     * Metodo que me fija/edita la contrasenia ingresada por el usuario
     * @param confirmPassword
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * Metodo que me obtiene el SO computador ingresada por el usuario
     * @return
     */
    public String getComputer() {
        return computer;
    }
    /**
     * Metodo que me fija/edita la marca del PC ingresado por el usuario
     * @param computer
     */
    public void setComputer(String computer) {
        this.computer = computer;
    }
    /**
     * Metodo que me obtiene la version del SO ingresada por el usuario
     * @return
     */
    public String getVersion() {
        return version;
    }
    /**
     * Metodo que me fija/edita la version del PC ingresado por el usuario
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * Metodo que me obtiene el lenguage del PC ingresada por el usuario
     * @return
     */
    public String getLanguage() {
        return language;
    }
    /**
     * Metodo que me fija/edita el lenguaje del PC ingresado por el usuario
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    /**
     * Metodo que me obtiene la marca del dispositivo movil ingresada por el usuario
     * @return
     */
    public String getMobileDevice() {
        return mobileDevice;
    }
    /**
     * Metodo que me fija/edita la marca del dispositivo movil ingresada por el usuario
     * @param mobileDevice
     */
    public void setMobileDevice(String mobileDevice) {
        this.mobileDevice = mobileDevice;
    }
    /**
     * Metodo que me obtiene el modelo del dispositivo movil ingresado por el usuario
     * @return
     */
    public String getModel() {
        return model;
    }
    /**
     * Metodo que me fija/edita el modelo del dispositivo movil ingresado por el usuario
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Metodo que me obtiene el SO del dispositivo movil ingresado por el usuario
     * @return
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }
    /**
     * Metodo que me fija/edita el SO dispositivo movil ingresado por el usuario
     * @param operatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * Metodo que me obtiene la ciudad ingresada por el usuario
     * @return
     */
    public String getCity() {
        return city;
    }
    /**
     * Metodo que me fija/edita la ciudad ingresada por el usuario
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * Metodo que me obtiene el codigo postal ingresado por el usuario
     * @return
     */
    public String getPostalCode() {
        return postalCode;
    }
    /**
     * Metodo que me fija/edita el codigo postal ingresado por el usuario
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    /**
     * Metodo que me obtiene el pais seleccionado por el usuario
     * @return
     */
    public String getCountry() {
        return country;
    }
    /**
     * Metodo que me fija/edita el  pais ingresado por el usuario
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }
    public String getFirstName() {
        return firstName;
    }
    /**
     * Metodo que me fija/edita el nombre ingresado por el usuario
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Metodo que me obtiene el apellido ingresado por el usuario
     * @return
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Metodo que me fija/edita el campo apellido ingresado por el usuario
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Metodo que me obtiene el email ingresado por el usuario
     * @return
     */
    public String getEmail() {
        return email;
    }
    /**
     * Metodo que me fija/edita el campo de email ingresado por el usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Metodo que me obtiene el mes de nacimiento ingresado por el usuario
     * @return
     */
    public String getBirthMonth() {
        return birthMonth;
    }
    /**
     * Metodo que me fija/edita el campo de mes de nacimiento ingresado por el usuario
     * @param birthMonth
     */
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }
    /**
     * Metodo que me obtiene el nombre ingresado por el usuario
     * @return
     */
    /**
     * Metodo que me obtiene el dia de nacimiento ingresado por el usuario
     * @return
     */
    public String getBirthDay() {
        return birthDay;
    }
    /**
     * Metodo que me fija/edita el campo de dia de nacimiento ingresado por el usuario
     * @param birthDay
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    /**
     * Metodo que me obtiene el anio de nacimiento ingresado por el usuario
     * @return
     */
    public String getBirthYear() {
        return birthYear;
    }
    /**
     * Metodo que me fija/edita el campo de anio de nacimiento ingresado por el usuario
     * @param birthYear
     */
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
}
