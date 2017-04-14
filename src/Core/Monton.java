/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author dygyb
 */
public class Monton {

    private int numFichas;
    private Ficha[] montonFichas;

    public Monton(int numFichas, Ficha[] montonFichas) {
        this.numFichas = numFichas;
        this.montonFichas = montonFichas;
    }

    public void rellenarMonton() {
        montonFichas = new Ficha[28];
        int ficha = 0;

        for (int i = 0; i < 28; i++) {

            for (int j = 0; j < 10; j++) {

                switch (i) {
                    case 0:
                        for (int k = 0; k < 7; k++) {
                            montonFichas[ficha].setNumIzquierda(i);
                            montonFichas[ficha].setNumDerecha(j);

                            ficha++;

                        }break;
                    case 1:for (int k = 1; k < 6; k++) {
                            montonFichas[ficha].setNumIzquierda(i);
                            montonFichas[ficha].setNumDerecha(j);

                            ficha++;

                        }break;
                    case 2:for (int k = 2; k < 6; k++) {
                            montonFichas[ficha].setNumIzquierda(i);
                            montonFichas[ficha].setNumDerecha(j);

                            ficha++;

                        }break;
                    case 3: for (int k = 3; k < 6; k++) {
                            montonFichas[ficha].setNumIzquierda(i);
                            montonFichas[ficha].setNumDerecha(j);

                            ficha++;

                        }break;
                    case 4: for (int k = 4; k < 6; k++) {
                            montonFichas[ficha].setNumIzquierda(i);
                            montonFichas[ficha].setNumDerecha(j);

                            ficha++;

                        }break;
                    case 5: for (int k = 5; k < 6; k++) {
                            montonFichas[ficha].setNumIzquierda(i);
                            montonFichas[ficha].setNumDerecha(j);

                            ficha++;

                        }break;
                }

            }

        }
        montonFichas[28].setNumIzquierda(6);
        montonFichas[28].setNumDerecha(6);
    }

    public int getNumFichas() {
        return numFichas;
    }

}
