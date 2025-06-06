package control;

public class LoginControler {
    
    // Datos del usuario temporal
String[][] credenciales = {
    {"AlvaritoBoy", "alvarito"},
    {"MariCode", "mari1234"},
    {"JuanDev", "juanpass"},
    {"SofiTech", "sofitech1"},
    {"Carlos99", "carlDev99"},
    {"NatyPro", "naty_2024"},
    {"LeoStack", "leoPass!"},
    {"ValeCoder", "valeC0de"},
    {"DaniScript", "dani++22"},
    {"UserX2025", "ux2025key"}
};


public boolean validacionDatos(String EntradaUsuario, String EntradaContrasenna) {

for (int i = 0; i < credenciales.length; i++) {
    if (credenciales[i][0].equals(EntradaUsuario) && credenciales[i][1].equals(EntradaContrasenna)) {
        return true; // Credenciales válidas
    }
}
return false; // Credenciales inválidas
}
}