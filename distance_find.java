class point {
    int x;
    int y;
    String name;
    point(int x, int y,String name) {
        this.x = x;
        this.y = y;
        this.name=name;
    }

    public void show() {
 System.out.println(""+name+" is " + this.x + "," + this.y + " ");
    }

    public point middle_point(point pt2,String str) {
        point r1 = this;
        int sum_x_cordinates = (r1.x + pt2.x) / 2;
        int sum_y_cordinates = (r1.y + pt2.y) / 2;
        point res = new point(sum_x_cordinates, sum_y_cordinates,str);
        return res;

    }

    public  double distance_pts(point pt2) {
        
        point point1=this;
        double diff_x=Math.pow((point1.x-pt2.x),2);
        double diff_y=Math.pow((point1.y-pt2.y),2);
        double distance=Math.sqrt(diff_x+diff_y);
        return distance;
    }

}

public class distance_find {
    public static void main(String[] args) {
        point pt1 = new point(3, 4,"point1");
        pt1.show();
        point pt2 = new point(7, 12,"point2");
        pt2.show();

        point mid = pt1.middle_point(pt2,"middle points");
        mid.show();

        System.out.println("distance "+pt2.distance_pts(pt1));          

    }
}
