This is a simple E-Commerce application to search products based on some filter.
It is build with Springboot, Spring JPA and in memory H2 database.
The app runs on http://localhost:8085
Check properties file for H2 db configurations.

----------------------------------------------------------------------------------------------------------------------------------------------------------
Run the below test data scripts on h2 console (http://localhost:8085/h2-console)

INSERT INTO CATEGORIES (category_name) VALUES('Clothing');
INSERT INTO CATEGORIES (category_name) VALUES('Footwear');
INSERT INTO CATEGORIES (category_name) VALUES('Accessories');
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'Lee', 'M', 1000.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'UCB', 'M', 900.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'USP', 'M', 1200.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'Lee', 'L', 1100.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'UCB', 'L', 1099.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'USP', 'XL', 1599.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'Lee', 'M', 1000.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'UCB', 'M', 900.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'USP', 'L', 1200.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'Lee', 'M', 1000.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'UCB', 'M', 999.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'USP', 'L', 1100.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'Lee', 'L', 1100.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'USP', 'S', 1099.00, 'SellerA', 1);
INSERT INTO PRODUCTS (type, brand, size, price, seller, category_id) VALUES('Shirt', 'USP', 'XL', 1299.00, 'SellerA', 1);

----------------------------------------------------------------------------------------------------------------------------------------------------------
Below are the test endpoints

http://localhost:8085/categories
http://localhost:8085/product/id/5
http://localhost:8085/product/brand/Lee
http://localhost:8085/product/size/M

----------------------------------------------------------------------------------------------------------------------------------------------------------



