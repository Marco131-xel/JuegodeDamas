package src.jugador;

public class Jugadores{
    private int id;
	private int puntos;
	private String nombre;
	private String nickname;

	public Jugadores(int id,int puntos, String nombre, String nickname){
        this.id = id;
		this.puntos = puntos;
		this.nombre = nombre;
		this.nickname = nickname;
	}

	//get y set
    public int getId(){
        return id;
    }
	public int getPuntos(){
        return puntos;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPuntos(int puntos){
        this.puntos = puntos;
    }

    public void setNickname(String nickname){
    	this.nickname = nickname;
    }

    public String getContar(){
        String prueba = id+")" +" || Nombre: "+nombre+" || Nickname: "+nickname+" // Puntos: 0";
        return prueba;
    }
}