public class HelperClass {

    public static void main(String[] args) {


        String fileName  = "Zemoso.txt";

        String content = " Zemoso Online Traning \n  Traniee: Sandeep Ambati \n Designation: QA Analyst ";

        FileHandling.CreateFile(fileName);

        FileHandling.WriteToFile(fileName,content);

        System.out.println(FileHandling.ReadFile(fileName));

        System.out.println(FileHandling.GetInfo(fileName));


    }
}
