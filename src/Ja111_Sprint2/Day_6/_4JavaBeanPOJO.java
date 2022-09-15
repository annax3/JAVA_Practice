package Ja111_Sprint2.Day_6;

import java.beans.JavaBean;

public class _4JavaBeanPOJO {
    //POJO : plain old java Object
    public static void main(String[] args) {
        JavaBean1 javaBean = new JavaBean1();
        //this won't work
        //System.out.println(javaBean.x);
        System.out.println(javaBean.getX());
    }
}
class JavaBean1{
    private int x;
    public int getX(){//getter
        return x;
    }
    public  void setX(int a){
        x=a;
    }
    JavaBean1(){}
}
class  AnotherJavaBean{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public AnotherJavaBean(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public AnotherJavaBean() {
    }

    public void setY(int y) {
        this.y = y;
    }
}