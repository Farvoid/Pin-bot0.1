public class PNG {


    private static String data2;
     String data3;

    public static String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }





    public  void Images() {

        String[] img = new String[3];

        img[0] = "https://vignette.wikia.nocookie.net/hildatheseries/images/b/bc/HildaTV_hilda-artwork-vector.svg/revision/latest/scale-to-width-down/281?cb=20181010161530";
        img[1] = "https://leonardo.osnova.io/9c2c2368-39fe-ec3c-6e92-62163cf7863c/-/scale_crop/900x507/center/-/format/webp/";
        img[2] = "https://leonardo.osnova.io/36cfa2a7-b14a-3129-3196-213bfb2184c1/-/scale_crop/1900x1069/center/-/format/webp/";
        int a, b;
        a = 2;
        b = 0;
        int random;
        random = b + (int) (Math.random() * a);
        System.out.println(random);


        data3 = img[random];

         System.out.println(data3);

    }


}

