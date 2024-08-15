import java.lang.Math;

class Body {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Body (double xP, double yP, double xV, 
                    double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Body(Body b) {
        xxPos = b.xxPos;
        yyPos = b.yyPos;
        xxVel = b.xxVel;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }

    public double calcDistance (Body b) {
        double delta_x = (xxPos - b.xxPos) * (xxPos - b.xxPos);
        double delta_y = (yyPos - b.yyPos) * (yyPos - b.yyPos);
        return Math.sqrt(delta_x + delta_y);
    }
}