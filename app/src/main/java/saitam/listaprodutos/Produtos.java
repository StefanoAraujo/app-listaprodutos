package saitam.listaprodutos;

public class Produtos {

    private String name;
    private String description;
    private String photo;
    private float price;
    private Categoria categoria;

    public Produtos(String name, String description, String photo, float price, Categoria c)
    {
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.price = price;
        this.categoria = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
