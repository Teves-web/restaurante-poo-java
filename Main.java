public class Main {

    public static void main(String[] args){
        Endereco enderecoRestauranteTeves = new Endereco();

        Endereco enderecoRestauranteTeves2 = new Endereco("123456", "Endereço Restaurante Teves");
        Endereco enderecoRestauranteFulano = new Endereco("566445", "Endereço Restaurante Fulano");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante do Teves");
        restaurante.setCnpj("000.000.0001-11");
        restaurante.setEndereco(enderecoRestauranteTeves2);
        System.out.println(restaurante);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante do Fulano");
        restaurante2.setCnpj("000.000.0001-12");
        restaurante2.setEndereco(enderecoRestauranteFulano);
        System.out.println(restaurante2);


    }

}
