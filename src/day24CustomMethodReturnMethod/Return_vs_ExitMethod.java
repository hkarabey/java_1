package day24CustomMethodReturnMethod;

public class Return_vs_ExitMethod {



        public static void main(String[] args) {
            month(13);
            System.out.println("hello word");
        }

        public static void month(int number) {

            if (number<1||number>12){

                System.out.println("invalid");
                System.exit(0);
            }

            String name="";
            switch (number) {
                case 1:
                    name="january";
                    break;
                case 2:
                    name="february";
                    break;
                case 3:
                    name="march";
                    break;
                case 4:
                    name="april";
                    break;
                case 5:
                    name="may";
                    break;
                case 6:
                    name="jun";
                    break;
                case 7:
                    name="july";
                    break;
                case 8:
                    name="augst";
                    break;
                case 9:
                    name="september";
                    break;
                case 10:
                    name="october";
                    break;
                case 11:
                    name="november";
                    break;
                case 12:
                    name="december";
                    break;
                default:
                    name="invalid number";
                    break;
            }
            System.out.println(name);
        }

    }






