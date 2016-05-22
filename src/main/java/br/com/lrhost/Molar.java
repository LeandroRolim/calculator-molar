package br.com.lrhost;

public class Molar {
    /**
     * Class que oferece metodos para calcular conetração Molar
     */
    public static Double getMassaMolar(Double volume, Double massa_soluto, Double molar) {
        Double massa_molar;
        try{
            massa_molar = massa_soluto / (volume * molar);
        }catch (Exception e){
            return 0.0;
        }
        return massa_molar;
    }

    public static Double getVolume(Double massa_molar, Double massa_soluto, Double molar) {
        Double volume;
        try {
            volume = massa_soluto / (massa_molar * molar);
        } catch (Exception e){
            return 0.0;
        }
        return volume;
    }

    public static Double getConcetracaoMolar(Double massa_molar, Double volume, Double massa_soluto) {
        Double concentracao_molar;
        try{
            concentracao_molar = (massa_soluto)/(massa_molar * volume);
        }catch (Exception e){
            return 0.0;
        }
        return concentracao_molar;
    }

    public static Double getMassaMoluto(Double volume, Double massa_molar, Double molar) {
        Double massa_soluto;
        try{
            massa_soluto = 1 / (volume * massa_molar * molar);
        } catch (Exception e){
            return 0.0;
        }
        return massa_soluto;
    }

}
