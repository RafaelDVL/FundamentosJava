package ClassesObjetos;

public class DataTeste {

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 17;
        data1.mes = 7;
        data1.ano = 1991;

        data1.dataPrint();


        Data data2 = new Data();

        data2.dia = 8;
        data2.mes = 11;
        data2.ano = 1960;

        data2.dataPrint();


    }
}
