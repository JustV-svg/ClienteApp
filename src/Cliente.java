public class Cliente {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    //Aqui inicia el constructor
    //codigo del constructor
    public Cliente(int id, String nombre, String apellido, String email, String telefono, String codigo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.codigo = codigo;
        //termina el codigo del constructor
        //finaliza el constructor
    }
    //Getters y Setters
    public int getId() {return id;}
    public void  setId(int id) {this.id = id;}
    public String getCodigo() {return  codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getNombre(){return  nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return  apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public String getEmail() {return email;}
    public void setEmail(String email){this.email = email;}
    public String getTelefono(){return telefono;}
    public void  setTelefono(String telefono){this.telefono = telefono;}

    @Override
    public String toString()
    {
        return "Cliente [ID = " + id + ", Código = " + codigo + ", Nombre = " + nombre + ", Apellido = " + apellido + ", Email = " + email + ", Teléfono = " + telefono + " ]";
    }
}