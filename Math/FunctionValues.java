// Mathias May

package mm82.Math;

import java.io.*;
import java.lang.*;
import mm82.Math.*;

import java.math.BigInteger;

public class FunctionValues {
    
    //--------------------------------------------------
    public static int Pow_positive_integer_power(int b,int p) {
        int toreturn;
        
        if (p==0)
        {
            if (b==0)
            {
                toreturn=(int)Math.pow(0,0);
            }
            else
            {
                toreturn=1;
            }
        }
        else
        {
            toreturn=b*Pow_positive_integer_power(b,p-1);
        }
        
        return toreturn;
    }
    public static BigInteger Pow_positive_integer_power(BigInteger b,int p) {
        return b.pow(p);
    }
    public static float Pow_positive_integer_power(float b,int p) {
        float toreturn;
        
        if (p==0)
        {
            toreturn=1;
        }
        else
        {
            toreturn=b*Pow_positive_integer_power(b,p-1);
        }
        
        return (float)toreturn;
    }
    public static double Pow_positive_integer_power(double b,int p) {
        double toreturn;
        
        if (p==0)
        {
            toreturn=1;
        }
        else
        {
            toreturn=b*Pow_positive_integer_power(b,p-1);
        }
        
        return (double)toreturn;
    }

    //--------------------------------------------------
    public static double Sin(double x) {
        return Math.sin(x);
    }
    public static float Sin(float x) {
        return (float)Math.sin(x);
    }

    //--------------------------------------------------
    public static double Cos(double x) {
        return Math.cos(x);
    }
    public static float Cos(float x) {
        return (float)Math.cos(x);
    }

    //--------------------------------------------------
    public static float Exp(float x) {
        return (float)Math.exp(x);
    }
    public static double Exp(double x) {
        return Math.exp(x);
    }

    //--------------------------------------------------
    public static float Sqrt(float x) {
        return (float)Math.sqrt(x);
    }
    public static double Sqrt(double x) {
        return Math.sqrt(x);
    }

    //Abs(x)-------------------------------------------------
    public static float Abs(float x) {
        return (float)(Math.abs(x));
    }
    public static double Abs(double x) {
        return Math.abs(x);
    }

    //Round(x,a)-------------------------------------------------
    public static float Round(float x, float a) {
        return (float)(Math.round(x/a)*a);
    }
    public static double Round(double x, double a) {
        return Math.round(x/a)*a;
    }
    public static long Round(long x, long a) {
        return
        (long)
        (
                Math.round
                (
                        (double)x
                    /
                        (double)a
                )
            *
                (double)a
        );
    }

    //Floor(x,a)-------------------------------------------------
    public static float Floor(float x, float a) {
        return (float)(Math.floor(x/a)*a);
    }
    public static double Floor(double x, double a) {
        return Math.floor(x/a)*a;
    }
    public static long Floor(long x, long a) {
        return
        (long)
        (
                Math.floor
                (
                        (double)x
                    /
                        (double)a
                )
            *
                (double)a
        );
    }

    //WholeNumber_which_is_the_next_smaller_or_equal_whole_number(x)-------------------------------------------------
    public static int WholeNumber_which_is_the_next_smaller_or_equal_whole_number(float x) {
        return (int)Math.floor(x);
    }
    public static int WholeNumber_which_is_the_next_smaller_or_equal_whole_number(double x) {
        return (int)Math.floor(x);
    }

    //WholeNumber_which_has_the_next_smaller_or_equal_magnitude(x)-------------------------------------------------
    public static int WholeNumber_which_has_the_next_smaller_or_equal_magnitude(float x) {
        return (int)(Math.signum(x)*Math.floor(Math.abs(x)));
    }
    public static int WholeNumber_which_has_the_next_smaller_or_equal_magnitude(double x) {
        return (int)(Math.signum(x)*Math.floor(Math.abs(x)));
    }

    
    
    //Max(list)-------------------------------------------------
    public static float Max(float list[]) {
        int n;
        float toreturn=list[0];
        for (n=1; n<=list.length-1; n++) {
            if (toreturn<list[n]) {toreturn=list[n];}
        }
        return toreturn;
    }
    public static double Max(double list[]) {
        int n;
        double toreturn=list[0];
        for (n=1; n<=list.length-1; n++) {
            if (toreturn<list[n]) {toreturn=list[n];}
        }
        return toreturn;
    }

    public static double Max(double a, double b) {
        
        if (a<b) {return b;}
        else     {return a;}
        
    }

    public static int Max(int a, int b) {
        
        if (a<b) {return b;}
        else     {return a;}
        
    }

    
    
    //Min(list)-------------------------------------------------
    public static float Min(float list[]) {
        int n;
        float toreturn=list[0];
        for (n=1; n<=list.length-1; n++) {
            if (list[n]<toreturn) {toreturn=list[n];}
        }
        return toreturn;
    }
    public static double Min(double list[]) {
        int n;
        double toreturn=list[0];
        for (n=1; n<=list.length-1; n++) {
            if (list[n]<toreturn) {toreturn=list[n];}
        }
        return toreturn;
    }

    public static double Min(double a, double b) {
        
        if (b<a) {return b;}
        else     {return a;}
        
    }

    public static int Min(int a, int b) {
        
        if (b<a) {return b;}
        else     {return a;}
        
    }

    //Mod(x,a)-------------------------------------------------
    public static float Mod(float x, float a) {
        return (float)(
              x
            - (
                (float)(
                    (long)(x/a)
                )
              )
            * a
        );
    }
    public static double Mod(double x, double a) {
        return (double)(
              x
            - (
                (double)(
                    (long)(x/a)
                )
              )
            * a
        );
    }

    //LinearTransition(x,x1,y1,x2,y2)-------------------------------------------------
    public static double LinearTransition
    (
        double x,
        double x1,
        double y1,
        double x2,
        double y2
    )
    {
        double d   = 1.0/(x2-x1);
        
        double m11 =   x2; double m12 = -x1;
        double m21 = -1.0; double m22 = 1.0;
        
        double a0 = d * (x2*y1-x1*y2);
        double a1 = d * (y2-y1);
        
        double toreturn;
        
        if ( x <= x1 )
        {
            toreturn = y1;
        }
        else if ( x2 <= x )
        {
            toreturn = y2;
        } 
        else
        {
            toreturn = a0+a1*x;
        }
        
        return toreturn;
    }
    
    

    //--------------------------------------------------
    public static double one_dimensional_linear_function_depending_on_two_points(double x, double x1, double y1, double x2, double y2) {
        double a0 = (x1*y2-x2*y1)/(x1-x2);
        double a1 = (y1-y2)/(x1-x2);
        return a0+a1*x;
    }
    public static float one_dimensional_linear_function_depending_on_two_points(float x, float x1, float y1, float x2, float y2) {
        float a0 = (x1*y2-x2*y1)/(x1-x2);
        float a1 = (y1-y2)/(x1-x2);
        return a0+a1*x;
    }
    
    
    
    //========================================================
    
    //Anisotropy function------------------------------------------
    public static double AnisotropyFunction(double x, double y) {
        double xmin=0.0;
        double xmax=Math.PI;
        int N=100;
        
        int n;
        
        double d=(xmax-xmin)/N;
        double x1=xmin;
        double x2=xmin+d;
        double f1;
        double f2;
        
        double a0;
        double a1;
        
        double Ii=0;
        double I=0;
        
        I=0;
        for(n = 1; n<=N; n++) {
            x1=xmin+(n-1)*d;
            x2=x1+d;
            f1=AnisotropyFunction_Integrand(x,y,x1);
            f2=AnisotropyFunction_Integrand(x,y,x2);
            a0=(x2*f1-x1*f2)/d;
            a1=(f2-f1)/d;
            Ii=x2*(a0+0.5*a1*x2)
                -x1*(a0+0.5*a1*x1);
            I+=Ii;
        }
        
        return (double)(
            1-I
        );
    }
    
    private static double AnisotropyFunction_Integrand(double x, double y, double θ){
        return
        (
            (
                3*x*x*y*y
            )
            /
            (
                2*Abs(x)*Abs(y)
            )
            *
            Sin(θ)*Math.pow(Cos(θ),2.0)
            *
            1/Sqrt
            (
                1-(1-x*x)*Math.pow(Cos(θ),2.0)
            )
            *
            1/Sqrt
            (
                1-(1-y*y)*Math.pow(Cos(θ),2.0)
            )
        );
    }
	
    public static double AnisotropyFunction_FirstDerivativeWithRespectToFirstArgument(double x, double y) {
        
        double xmin=0.0;
        double xmax=Math.PI;
        int N=100;
        
        int n;
        
        double d=(xmax-xmin)/N;
        double x1=xmin;
        double x2=xmin+d;
        double f1;
        double f2;
        
        double a0;
        double a1;
        
        double Ii=0;
        double I=0;
        
        I=0;
        for(n = 1; n<=N; n++) {
            x1=xmin+(n-1)*d;
            x2=x1+d;
            f1=AnisotropyFunction_FirstDerivativeWithRespectToFirstArgument_Integrand(x,y,x1);
            f2=AnisotropyFunction_FirstDerivativeWithRespectToFirstArgument_Integrand(x,y,x2);
            a0=(x2*f1-x1*f2)/d;
            a1=(f2-f1)/d;
            Ii=x2*(a0+0.5*a1*x2)
                -x1*(a0+0.5*a1*x1);
            I+=Ii;
        }
        
        return (double)(
            I
        );
    }

    private static double AnisotropyFunction_FirstDerivativeWithRespectToFirstArgument_Integrand(double x, double y, double θ){
        return
        (
             3.0
            *(Cos(θ)-1.0)
            *Cos(θ)*Cos(θ)
            *(Cos(θ)+1.0)
            *Sin(θ)
            *y
            /2.0
            /Math.signum(x)
            /Math.signum(y)
            /Math.pow
            (
                (
                    (
                        Cos(θ)*Cos(θ)
                        *(x*x-1.0)
                    )
                    +
                    1.0
                )
                ,1.5
            )
            /Math.pow
            (
                (
                    (
                        Cos(θ)*Cos(θ)
                        *(y*y-1.0)
                    )
                    +
                    1.0
                )
                ,0.5
            )
        );
    }
    
    
	
    public static double AnisotropyFunction_FirstDerivativeWithRespectToSecondArgument(double x, double y) {
        return AnisotropyFunction_FirstDerivativeWithRespectToFirstArgument(y,x);
    }

}
