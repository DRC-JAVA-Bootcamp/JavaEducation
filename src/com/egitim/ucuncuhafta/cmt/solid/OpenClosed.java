package com.egitim.ucuncuhafta.cmt.solid;

public class OpenClosed {

    /**
     * “Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.”
     * Robert C. Martin
     */

    public void productOrder(String osType) {

        Order order = new Order();
        order.setProductName("Computer");
        order.setProductPrice(1000);

        if (osType.equals("M1")) {
            // stock control
            // add to basket
            // payment

        } else if (osType.equals("Windows")) {
            //stock control


        }

    }


    class Order {

        String productName;
        int productPrice;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(int productPrice) {
            this.productPrice = productPrice;
        }
    }


    interface IProductOrder {
        public void productOrder();

    }

    public class M1ProductOrder implements IProductOrder {

        @Override
        public void productOrder() {
            // stock control
            // add to basket
            // payment
        }
    }

    public class WindowsProductOrder implements IProductOrder {

        @Override
        public void productOrder() {
            // stock control
            // add to basket
            // payment

        }
    }

    public void productOrderImpl(String osType) {
        IProductOrder productOrder;

        if (osType.equals("M1")) {
            productOrder = new M1ProductOrder();
            productOrder.productOrder();

        } else if (osType.equals("Windows")) {
            productOrder = new WindowsProductOrder();
            productOrder.productOrder();

        }
    }


}
