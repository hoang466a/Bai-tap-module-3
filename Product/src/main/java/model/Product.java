package model;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int priceProduct;
    private int quantityProduct;
    private String colorProduct;
    private String desProduct;
    private String cateProduct;

    public Product() {
    }

    public Product(String nameProduct, int priceProduct, int quantityProduct, String colorProduct, String desProduct, String cateProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantityProduct = quantityProduct;
        this.colorProduct = colorProduct;
        this.desProduct = desProduct;
        this.cateProduct = cateProduct;
    }

    public Product(int idProduct, String nameProduct, int priceProduct, int quantityProduct, String colorProduct, String desProduct, String cateProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantityProduct = quantityProduct;
        this.colorProduct = colorProduct;
        this.desProduct = desProduct;
        this.cateProduct = cateProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getColorProduct() {
        return colorProduct;
    }

    public void setColorProduct(String colorProduct) {
        this.colorProduct = colorProduct;
    }

    public String getDesProduct() {
        return desProduct;
    }

    public void setDesProduct(String desProduct) {
        this.desProduct = desProduct;
    }

    public String getCateProduct() {
        return cateProduct;
    }

    public void setCateProduct(String cateProduct) {
        this.cateProduct = cateProduct;
    }
}
