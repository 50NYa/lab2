public class Task {
    private double x, y, z, result;

    Task(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.result = 0;
    }

    void set(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void run(){
        this.result = Math.abs(Math.pow(this.x, this.y/this.x) - Math.pow((this.y/this.x), 0.33333)) + ((this.y - this.x) * ((Math.cos(y) - ((this.z) / (this.y - this.x)) ) / (1 + Math.pow((this.y - this.x), 2))));
    }


    void print(){
        System.out.println("ш = " + this.result);
    }

    public double getResultTask(){
        return result;
    }

}
