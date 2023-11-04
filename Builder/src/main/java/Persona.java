public class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    Persona(PersonaBuilder personaBuilder){
        this.nombre = personaBuilder.nombre;
        this.apellido = personaBuilder.apellido;
        this.edad = personaBuilder.edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
    public static class PersonaBuilder{
        private String nombre;
        private String apellido;
        private int edad;
        public  PersonaBuilder(){}
        public PersonaBuilder(Persona persona){
            this.setNombre(persona.nombre);
            this.setApellido(persona.apellido);
            this.setEdad(persona.edad);
        }
        public Persona build(){
            return new Persona(this);
        }
        public PersonaBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public PersonaBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }
        public PersonaBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }
    }
}