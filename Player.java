/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elena
 */
import java.util.*;
public class Player {
    String name;
   List<Integer>  points;
    String password;

    public Player() {
      
        name="";
        password="";
    }

    public Player(String name,String password) {
        this.name = name;
        
        this.password=password;
    }

    public Player(String name,String password,List<Integer>points) {
        this.name = name;
        this.points = points;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getPoints() {
        return points;
    }

    public void setPoints(List<Integer> points) {
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", points=" + points + ", password=" + password + '}';
    }
    public int getTotalScore() {
  return points.stream().mapToInt(i -> i).sum();
}


    }

 
    
    

