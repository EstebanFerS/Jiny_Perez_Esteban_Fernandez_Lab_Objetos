/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jiny_perez_esteban_fernandez_lab_objetos;

/**
 *
 * @author esteb
 */
public class Jugador {
    public static Jugador jugador1 = null;
    public static Jugador jugador2 = null;
    public static boolean loggeado = false;
    public static int UsuariosTotales = 0;
    
    public static Jugador[]jugadores = new Jugador[100];
    
    public String username;
    public String password;
    public int puntos = 0;
    
    public Jugador(String username, String password){
        this.username = username;
        this.password = password;
        this.puntos = 0;
    }
    
    public void setUsername(String username){
        this.username =  username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPuntos(int puntos){
        this.puntos += puntos;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public boolean validar(String password){
        return this.password.equals(password);
    }
}
