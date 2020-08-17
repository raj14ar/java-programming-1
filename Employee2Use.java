package JavaAssignment1;

class Employee2 {
    String name;
    int yearOfJoining;
    String address;
    public Employee2(String name,int yearOfJoining,String address){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.address=address;
    }

    void print() {
        System.out.println(name +"\t\t\t\t\t\t\t" + yearOfJoining + "\t\t\t\t\t\t" + address);
    }
}
public class Employee2Use{



    public static void main(String[] args) {
        String[] names={"Robert","Sam ","John"};
        int[] year ={1994,2000,1999};
        String[] add ={"64C- WallStreet","68D- WallStreet","26B- WallStreet"};
        Employee2[] empList = new Employee2[3];
        for(int i=0;i<3;i++){
            empList[i]= new Employee2(names[i],year[i],add[i]);
        }
        System.out.println("Name\t\t\t\t" + "\t\tYear of Joining\t\t" + "\t\t\t\tAddress\t\t\t\t");
        for(int i=0;i<3;i++){
            empList[i].print();
        }
    }
}
