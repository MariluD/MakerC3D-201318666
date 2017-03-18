package org.compi2.codigo3d.parser;

public class ControlC3D {
    
    private static int temp = 0;
    private static int temp2 = 0;
    private static int aux = 0;
    private static String c3d = "";
    private static String cc = "";
    private static String v = "";
    private static String f = "";
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        temp2 = 0;
        c3d = "";
        cc = "";
        v = "";
        f = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (L#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static String generaEtiqueta(){
        return "L"+temp2++;
    }
    
    public static void setEtiqueta(){
        temp2--;
    }
    
    public static String LastEtiqueta(){
        aux = temp2 - 1;
        if(aux >= 0)
            return "L" + aux;
        else
            return "";
    }
    
    public static void agregarV(String r){
        if(v.equals(""))
            v = r;
        else
            v = v + " " + r;
    }
    
    public static void agregarF(String r){
        if(f.equals(""))
            f = r;
        else
            f = f + " " + r;
    }
    
    public static String getV(){
        return v;
    }
    
    public static String getF(){
        return f;
    }
    
    public static void V(String m){
        v = v.replaceAll(m, "");
    }
    
    public static void F(String m){
        f = f.replaceAll(m, "");
    }
    
    public static String Etiqueta1(){
        if(temp2 == 0){
            return "";
        }
        else{
            aux = temp2 - 1;
            return "L" + aux;
        }
    }
    
    public static String Etiqueta2(){
        if(temp2 == 0){
            return "";
        }
        else{
            aux = temp2 - 2;
            return "L" + aux;
        }
    }
    
    public static String Etiqueta3(){
        if(temp2 == 0){
            return "";
        }
        else{
            aux = temp2 - 3;
            return "L" + aux;
        }
    }
    
    public static String Etiqueta4(){
        if(temp2 == 0){
            return "";
        }
        else{
            aux = temp2 - 4;
            return "L" + aux;
        }
    }
    
    public static String nombreEtiqueta(){
        aux = temp2 - 1;
        return "L" + aux;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    public static void agregarCC(String sentencia){
        cc += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static String getCC(){
        return cc;
    }
    
}
