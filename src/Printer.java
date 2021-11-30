public class Printer {
    //в условии есть слово функция,завис на 3 часа,позвал все семью,так и не понял что это
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String d = in.nextLine();
        if(d == "массив int"){
            int[] a = in.nextInt();
            Printer.print1(5);
        }
        if(d == "массив double"){
            double[] a = in.nextDouble();
            Printer.print1(5);
        }
        else if(d == "int"){
            int a = in.nextInt();
            Printer.print1(5);
        }
        else {
            Double a = in.nextDouble();
            Printer.print1(5);
        }

    }
    public static void print1(int i){
        System.out.print(i);
    }
}
