/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elena
 */
public class Question {
    String text;
    String opt1;
    String opt2;
    String opt3;
    String opt4;
    int id;
    String rasp;

    public Question() {
        text=null;
        opt1=null;
        opt2=null;
        opt3=null;
        opt4=null;
        id=0;
        rasp=null;
        
    }

    public Question(String text, String opt1, String opt2, String opt3, String opt4,String rasp) {
        this.text = text;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.rasp=rasp;
    }

    public Question(String text, String opt1, String opt2, String opt3, String opt4, int id,String rasp) {
        this.text = text;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.id = id;
        this.rasp=rasp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getRasp() {
        return rasp;
    }

    public void setRasp(String rasp) {
        this.rasp = rasp;
    }

    

    public Question(String text, int id) {
        this.text = text;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Question{" + "text=" + text + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + ", opt4=" + opt4 + ", id=" + id + ", rasp=" + rasp + '}';
    }

 
    
}
