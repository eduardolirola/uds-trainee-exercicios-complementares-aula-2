public class ProjetoYoutube {

    public static void main(String[] args) {
//       V = VETOR DE OBJETOS
        Video v[] = new Video[3];

        v[0] = new Video("MEU PRIMEIRO VIDEO");
        v[1] = new Video("Meu SEGUNDO VIDEO");
        v[2] = new Video("MEU TERCEIRO VIDEO");

//        USUARIO

       Usuario user[] = new Usuario[3];

       user[0] = new Usuario("MARCOS",22,"M","marcos22");
       user[1] = new Usuario("DANIELA",22,"F","dani");
       user[2] = new Usuario("CARLOS EDUARDO ",26,"M","eduardo");

       Visualizacao visu[] = new Visualizacao[5];

       visu[0] = new Visualizacao(user[2],v[1]);  /*Daniela assiste Meu primeiro video*/
        visu[0].avaliar();
        System.out.println(visu[0].toString()+"\n");

       visu[1] = new Visualizacao(user[2], v[2]); /* Daniela assiste Meu segundo video*/
        visu[1].avaliar(87.0f);
        System.out.println(visu[1].toString());






/*
        System.out.println("VIDEOS \n ---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString()+ "\n");
        System.out.println("USUARIOS \n -------------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());
        System.out.println(u[2].toString());

   */ }
}
