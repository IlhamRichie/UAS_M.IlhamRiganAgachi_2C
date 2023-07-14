import java.util.Arrays;

class Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;
    private String[] images;

    public Product(int id, String title, String description, double price, double discountPercentage, double rating,
                   int stock, String brand, String category, String thumbnail, String[] images) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.stock = stock;
        this.brand = brand;
        this.category = category;
        this.thumbnail = thumbnail;
        this.images = images;
        //M.Ilham Rigan Agachi 2C
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String[] getImages() {
        return images;
    }
    //M.Ilham Rigan Agachi 2C

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                ", rating=" + rating +
                ", stock=" + stock +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", images=" + Arrays.toString(images) +
                '}';
        //M.Ilham Rigan Agachi 2C
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "iPhone 9", "An apple mobile which is nothing like apple", 549, 12.96, 4.69, 94, "Apple", "smartphones",
                        "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
                        new String[]{
                                "https://i.dummyjson.com/data/products/1/1.jpg",
                                "https://i.dummyjson.com/data/products/1/2.jpg",
                                "https://i.dummyjson.com/data/products/1/3.jpg",
                                "https://i.dummyjson.com/data/products/1/4.jpg",
                                "https://i.dummyjson.com/data/products/1/thumbnail.jpg"
                        }
                ),
                new Product(2, "iPhone X", "SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...",
                        899, 17.94, 4.44, 34, "Apple", "smartphones",
                        "https://i.dummyjson.com/data/products/2/thumbnail.jpg",
                        new String[]{
                                "https://i.dummyjson.com/data/products/2/1.jpg",
                                "https://i.dummyjson.com/data/products/2/2.jpg",
                                "https://i.dummyjson.com/data/products/2/3.jpg",
                                "https://i.dummyjson.com/data/products/2/thumbnail.jpg"
                        }
                ),
                new Product(3, "Samsung Universe 9", "Samsung's new variant which goes beyond Galaxy to the Universe",
                        1249, 15.46, 4.09, 36, "Samsung", "smartphones",
                        "https://i.dummyjson.com/data/products/3/thumbnail.jpg",
                        new String[]{
                                "https://i.dummyjson.com/data/products/3/1.jpg"
                        }
                ),
                new Product(4, "OPPOF19", "OPPO F19 is officially announced on April 2021.", 280, 17.91, 4.3, 123, "OPPO", "smartphones",
                        "https://i.dummyjson.com/data/products/4/thumbnail.jpg",
                        new String[]{
                                "https://i.dummyjson.com/data/products/4/1.jpg",
                                "https://i.dummyjson.com/data/products/4/2.jpg",
                                "https://i.dummyjson.com/data/products/4/3.jpg",
                                "https://i.dummyjson.com/data/products/4/4.jpg",
                                "https://i.dummyjson.com/data/products/4/thumbnail.jpg"
                        }
                ),
                new Product(5, "Huawei P30", "Huawei’s re-badged P30 Pro New Edition was officially unveiled yesterday in Germany and now the device has made its way to the UK.",
                        499, 10.58, 4.09, 32, "Huawei", "smartphones",
                        "https://i.dummyjson.com/data/products/5/thumbnail.jpg",
                        new String[]{
                                "https://i.dummyjson.com/data/products/5/1.jpg",
                                "https://i.dummyjson.com/data/products/5/2.jpg",
                                "https://i.dummyjson.com/data/products/5/3.jpg"
                        }
                )
        };

        System.out.println("Produk Sebelum Diurutkan:");
        for (Product product : products) {
            System.out.println(product);
            System.out.println("------------------------------------");
        }

        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (products[j].getRating() > products[maxIndex].getRating()) {
                    maxIndex = j;
                }
            }
            Product temp = products[maxIndex];
            products[maxIndex] = products[i];
            products[i] = temp;
        }

        System.out.println("Produk Setelah Diurutkan:");
        for (Product product : products) {
            System.out.println(product);
            System.out.println("------------------------------------");
        }
    }
}
