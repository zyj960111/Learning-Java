package homework;

/**
 * @author Liu Awen
 * @create 2018-05-11 13:26
 */
class Day05_Test02{
    public static void main(String[] args){
        //用两个String数组来表示 hua  dian
        String[] hua = {"黑桃","红桃","梅花","方片"};
        String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(int i=0; i<hua.length; i++){
            for(int j=0; j<dian.length; j++){
                System.out.print(hua[i]+dian[j] + " ");
            }
            System.out.println();
        }
    }
}