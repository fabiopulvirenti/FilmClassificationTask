package com.sparta.fp;

public class FilmClassifications {
//    public static String availableClassifications(int ageOfViewer)
//    {
//        String result;
//        if (ageOfViewer < 12)
//        {
//            result = "U, PG & 12 films are available.";
//        }
//        else if (ageOfViewer < 15)
//        {
//            result = "U, PG, 12 & 15 films are available.";
//        }
//        else
//        {
//            result = "All films are available.";
//        }
//        return result;
//    }


//Are the requirements correct and complete? the answer is no, below are the amended requirement

    public static String availableClassifications(int ageOfViewer) {
        String result;
        if (ageOfViewer >=0 && ageOfViewer< 12) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer>=12 && ageOfViewer < 15) {
            result = "U, PG, 12 & 15 films are available.";
        } else if (ageOfViewer>=15 && ageOfViewer < 18){
            result = "U, PG, 12 & 15 and lower than 18 films are available";
        } else if ( ageOfViewer>=18 &&ageOfViewer <120){
            result="Suitable only for adult";
        }
        else {
            result="No one can live beyond that age";
        }
        return result;
    }
}




