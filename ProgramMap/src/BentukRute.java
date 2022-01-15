public class BentukRute {
    public static void main(String[] args) {
        double jarak = 0;
        double[][] rute = {
            {0,0,0,0.6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,2,2.7,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0.1,0,0,0,0,1.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0.6,2.7,0.1,0,0.3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0.3,0,0.5,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0.5,0,0.8,0,0,0,1.3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0.8,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,0.8,0,0,0,3.5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1.8,0,0,0,0,0.8,0,0,0,0,0,0,0,0,0,1.6,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1.3,0,0,0,1,0,0.3,0,0,0,0,0,0,0.7,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0,0,0,0.3,0,0,0,0,0,0,0,0,0.8,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,3.5,0,0,0,0,0,0.5,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0.4,0,0.5,0,0,0,0,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,0.2,0,1.5,0,0,0,0.3,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.2,0,0.5,0,0,0,0,0,0,0,0,0,0,0.3},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,2.3,0,0,0,0,0,3.5,0,0,0,1.75},
            {0,0,0,0,0,0,0,0,1.6,1,0,0,0,0,1.5,0,2.3,0,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0.7,0,0,0,0,0,0,1,0,0.3,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0.8,0,0,0,0,0,0,0.3,0,0.7,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1.5,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0.3,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,1,0.5,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3.5,0,0,0,0.4,0,1,0,0,0,0.5,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,0,0.9,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.9,0,0.7,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,0.7,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.3,1.75,0,0,0,1,0,0,1.75,0,0,0,0}
        };
        //double total = HitungJarak(rute, 0, jarak, 1);
        double total = HitungJarak2(rute, 0, jarak, 25);
        System.out.println ("Jarak : "+total+" KM");
    }
/*
    public static double HitungJarak (double[][] rute, int awal, double jarak, int tujuan) {
        double jalan = 0;
        int temp = 0;
        for (int i = 0; i < rute.length; i++) {
            if (rute[awal][i] != 0) {
                if (jalan == 0) {
                    jalan = rute[awal][i];
                }
                else {
                    if (rute[awal][i] < jalan) {
                        jalan = rute[awal][i];
                    }
                }
                System.out.println ("-"+jalan+"-");
            }
            if (i == rute.length - 1) {
                int k = CekIndeksAwal(jalan, rute, awal);
                awal = k; i = 0;
                
                System.out.println ("k : "+k+" l : "+i);
                jalan = 0;
            }
        }
        return jarak;
    }
    public static int CekIndeksAwal (double angka, double[][] rute, int awal) {
        int i = 0, j = 0;
        for (i = 0; i < rute.length; i++) {
            if (rute[awal][i] == angka)
                return i;
        }
        return i;
    }
    public static int CekIndeksTujuan (double angka, double[][] rute) {
        int i = 0, j = 0;
        for (i = 0; i < rute.length; i++) {
            for (j = 0; j < rute.length; j++) {
                if (rute[i][j] == angka) {
                    return i;
                }
            }
        }
        return i;
    }
*/
    public static double HitungJarak2 (double[][] rute, int awal, double jarak, int tujuan) {
        double[] jalan = new double [rute.length];
        int[] temp = new int [rute.length];
        double before = 0, total = 0;
        int n = 0, min = 0;
        while (awal != tujuan) {
            for (int i = 0; i < rute.length; i++) {
                if (rute[awal][i] != 0) {
                    jalan[n] = rute[awal][i];
                    temp[n] = i;
                    System.out.println (n+"-"+jalan[n]+"->"+temp[n]);
                    n++; } } 
            for (int j = 0; j < n; j++) {
                if (n == 1) {
                    System.out.println ("Proses 1");
                    jarak = jalan[n-1];
                    awal = temp[n-1];
                    System.out.println (jarak+"--"+before+"--"+awal);
                }
                else {
                    System.out.println ("Proses 2--> "+min+" -- "+j);
                    if (jalan[min] > jalan[j]) {
                        System.out.println ("Proses 3-->"+before);
                        if (jalan[j] == before) {
                            before = 0;
                            System.out.println ("Proses 4");
                            if (j == 1) {
                                awal = temp[0];
                            }
                        }
                        else {
                            min = j;
                            jarak = jalan[min];
                            awal = temp[min];
                            System.out.println (jarak+"--"+before+"--"+awal);
                        }
                    }
                    else if (jalan[min] == jalan[j]) {
                        System.out.println ("Proses 5");
                        if (jalan[j] == before) {
                            before = 0;
                            if (jalan[j] == 0.3) {
                                min = j+1;
                            }
                            else if (jalan[j] == 0.5)
                                min = j+1;
                            else if (jalan[j] == 0.8) {
                                min = j+1;
                                awal = temp[min];
                            }
                        }
                        else {
                            if (j == 1) {
                                jarak = jalan[j];
                                awal = temp[j];
                            }
                            System.out.println ("Proses 6");
                            jarak = jalan[min];
                        }
                        
                    }
                    else if (jalan[min] < jalan[j]) {
                        if (jalan[j] == 2) {
                            jarak = jalan[j];
                            awal = temp[j];
                        }
                        else {
                        jarak = jalan[min];
                        awal = temp[min];
                        System.out.println (jarak+"--"+before+"--"+awal); 
                        }
                    }
                }
            }
            before = jarak;
            System.out.println ("--"+before+"--"+awal);
            total += jarak;
            System.out.println ("Jarak : "+total);
            n = 0; min = 0;
        }
        return total;
    }
}
