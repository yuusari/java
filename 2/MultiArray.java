class MultiArray{

    public static void main(String[] args ){
        int [][] allScore = new int[2] [3] ;
        allScore[0][0] = 80;
        allScore[0][1] = 100;
        allScore[0][2] = 75;
        allScore[1][0] = 85;
        allScore[1][1] = 95;
        allScore[1][2] = 80;

        System.out.println(allScore[0][0] + "�_");
        System.out.println(allScore[0][1] + "�_");
        System.out.println(allScore[0][2] + "�_");
        System.out.println(allScore[1][0] + "�_");
        System.out.println(allScore[1][1] + "�_");
        System.out.println(allScore[1][2] + "�_");

        System.out.println("allScore.length :" + allScore.length);
        System.out.println("allScore[0].length :" + allScore[0].length);

    }
}
