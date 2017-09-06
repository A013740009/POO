/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador_huellas_examen;

/**
 *
 * @author ercv1
 */
public class Minutia {

    
    short x;
    short y;
    int angle;
    byte type;

    public Minutia(short x, short y, int angle, byte type) {
        this.x = 1;
        this.y = 1;
        this.angle = 1;
        this.type = 1;
    }



    public short getX() {
        return x;
    }

    public short getY() {
        return y;
    }

    public int getAngle() {
        return angle;
    }

    public byte getType() {
        return type;
    }

    public void setX(short x) {
        this.x = x;
    }

    public void setY(short y) {
        this.y = y;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setType(byte type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return x+","+y+","+angle+","+type;
    }
}
