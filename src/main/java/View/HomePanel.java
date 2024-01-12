/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import javax.swing.UIManager;

/**
 *
 * @author Michelle Arias
 */
public class HomePanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
        UIManager.put( "panelRestaurant.arc", 9);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separator = new javax.swing.JSeparator();
        nearbyTxt = new javax.swing.JLabel();
        scrollRestaurants = new javax.swing.JScrollPane();
        backgroundRest = new javax.swing.JPanel();
        sushiHouse = new View.PanelRound();
        sushiPic = new javax.swing.JLabel();
        sushiTitle = new javax.swing.JLabel();
        sushiTime = new javax.swing.JLabel();
        mexicanPalace = new View.PanelRound();
        mexPic = new javax.swing.JLabel();
        mexTitle = new javax.swing.JLabel();
        mexTime = new javax.swing.JLabel();
        burgersAndPizza = new View.PanelRound();
        burgerPic = new javax.swing.JLabel();
        burgerTitle = new javax.swing.JLabel();
        burgerTime = new javax.swing.JLabel();
        shawarmaQueen = new View.PanelRound();
        shawarmaPic = new javax.swing.JLabel();
        shawarmaTitle = new javax.swing.JLabel();
        shawarmaTime = new javax.swing.JLabel();
        coffeeTime = new View.PanelRound();
        coffePic = new javax.swing.JLabel();
        coffeTitle = new javax.swing.JLabel();
        coffeTime = new javax.swing.JLabel();
        trattoriaBtn = new View.PanelRound();
        trattoriaPic = new javax.swing.JLabel();
        trattoriaTitle = new javax.swing.JLabel();
        trattoriaTime = new javax.swing.JLabel();
        dealBurgers = new View.PanelRound();
        dealBig = new javax.swing.JLabel();
        discountBurger = new javax.swing.JLabel();
        couponB = new javax.swing.JLabel();
        burgersPic = new javax.swing.JLabel();
        dealDessert = new View.PanelRound();
        allDesserts = new javax.swing.JLabel();
        dessertDiscount = new javax.swing.JLabel();
        coupon = new javax.swing.JLabel();
        cupcake = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        separator.setForeground(new java.awt.Color(237, 238, 242));

        nearbyTxt.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        nearbyTxt.setText("Nearby restaurants");

        scrollRestaurants.setBackground(new java.awt.Color(255, 255, 255));
        scrollRestaurants.setBorder(null);
        scrollRestaurants.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollRestaurants.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backgroundRest.setBackground(new java.awt.Color(255, 255, 255));

        sushiHouse.setBackground(new java.awt.Color(243, 244, 255));
        sushiHouse.setRoundBottomLeft(30);
        sushiHouse.setRoundBottomRight(30);
        sushiHouse.setRoundTopLeft(30);
        sushiHouse.setRoundTopRight(30);

        sushiPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sushi.png"))); // NOI18N

        sushiTitle.setFont(new java.awt.Font("Nunito Medium", 1, 12)); // NOI18N
        sushiTitle.setText("Royal Sushi House");

        sushiTime.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        sushiTime.setForeground(new java.awt.Color(153, 153, 153));
        sushiTime.setText("30-40 min     ");

        javax.swing.GroupLayout sushiHouseLayout = new javax.swing.GroupLayout(sushiHouse);
        sushiHouse.setLayout(sushiHouseLayout);
        sushiHouseLayout.setHorizontalGroup(
            sushiHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sushiPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sushiHouseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sushiHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sushiTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sushiTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sushiHouseLayout.setVerticalGroup(
            sushiHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sushiHouseLayout.createSequentialGroup()
                .addComponent(sushiPic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sushiTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sushiTime)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        mexicanPalace.setBackground(new java.awt.Color(243, 244, 255));
        mexicanPalace.setRoundBottomLeft(30);
        mexicanPalace.setRoundBottomRight(30);
        mexicanPalace.setRoundTopLeft(30);
        mexicanPalace.setRoundTopRight(30);

        mexPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mex.png"))); // NOI18N

        mexTitle.setFont(new java.awt.Font("Nunito Medium", 1, 12)); // NOI18N
        mexTitle.setText("Mexican Palace");

        mexTime.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        mexTime.setForeground(new java.awt.Color(153, 153, 153));
        mexTime.setText("30-40 min     ");

        javax.swing.GroupLayout mexicanPalaceLayout = new javax.swing.GroupLayout(mexicanPalace);
        mexicanPalace.setLayout(mexicanPalaceLayout);
        mexicanPalaceLayout.setHorizontalGroup(
            mexicanPalaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mexPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mexicanPalaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mexicanPalaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mexTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mexTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mexicanPalaceLayout.setVerticalGroup(
            mexicanPalaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mexicanPalaceLayout.createSequentialGroup()
                .addComponent(mexPic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mexTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mexTime)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        burgersAndPizza.setBackground(new java.awt.Color(243, 244, 255));
        burgersAndPizza.setRoundBottomLeft(30);
        burgersAndPizza.setRoundBottomRight(30);
        burgersAndPizza.setRoundTopLeft(30);
        burgersAndPizza.setRoundTopRight(30);

        burgerPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/burgers.png"))); // NOI18N

        burgerTitle.setFont(new java.awt.Font("Nunito Medium", 1, 12)); // NOI18N
        burgerTitle.setText("Burgers & Pizza");

        burgerTime.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        burgerTime.setForeground(new java.awt.Color(153, 153, 153));
        burgerTime.setText("30-40 min     ");

        javax.swing.GroupLayout burgersAndPizzaLayout = new javax.swing.GroupLayout(burgersAndPizza);
        burgersAndPizza.setLayout(burgersAndPizzaLayout);
        burgersAndPizzaLayout.setHorizontalGroup(
            burgersAndPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(burgerPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(burgersAndPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(burgersAndPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(burgerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        burgersAndPizzaLayout.setVerticalGroup(
            burgersAndPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(burgersAndPizzaLayout.createSequentialGroup()
                .addComponent(burgerPic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(burgerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(burgerTime)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        shawarmaQueen.setBackground(new java.awt.Color(243, 244, 255));
        shawarmaQueen.setRoundBottomLeft(30);
        shawarmaQueen.setRoundBottomRight(30);
        shawarmaQueen.setRoundTopLeft(30);
        shawarmaQueen.setRoundTopRight(30);

        shawarmaPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shawarma.png"))); // NOI18N

        shawarmaTitle.setFont(new java.awt.Font("Nunito Medium", 1, 12)); // NOI18N
        shawarmaTitle.setText("Shawarma Queen");

        shawarmaTime.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        shawarmaTime.setForeground(new java.awt.Color(153, 153, 153));
        shawarmaTime.setText("30-40 min     ");

        javax.swing.GroupLayout shawarmaQueenLayout = new javax.swing.GroupLayout(shawarmaQueen);
        shawarmaQueen.setLayout(shawarmaQueenLayout);
        shawarmaQueenLayout.setHorizontalGroup(
            shawarmaQueenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shawarmaPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(shawarmaQueenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shawarmaQueenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shawarmaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shawarmaTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shawarmaQueenLayout.setVerticalGroup(
            shawarmaQueenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shawarmaQueenLayout.createSequentialGroup()
                .addComponent(shawarmaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shawarmaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shawarmaTime)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        coffeeTime.setBackground(new java.awt.Color(243, 244, 255));
        coffeeTime.setRoundBottomLeft(30);
        coffeeTime.setRoundBottomRight(30);
        coffeeTime.setRoundTopLeft(30);
        coffeeTime.setRoundTopRight(30);

        coffePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee.png"))); // NOI18N

        coffeTitle.setFont(new java.awt.Font("Nunito Medium", 1, 12)); // NOI18N
        coffeTitle.setText("Coffee Time");

        coffeTime.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        coffeTime.setForeground(new java.awt.Color(153, 153, 153));
        coffeTime.setText("30-40 min     ");

        javax.swing.GroupLayout coffeeTimeLayout = new javax.swing.GroupLayout(coffeeTime);
        coffeeTime.setLayout(coffeeTimeLayout);
        coffeeTimeLayout.setHorizontalGroup(
            coffeeTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coffePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(coffeeTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coffeeTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coffeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coffeTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coffeeTimeLayout.setVerticalGroup(
            coffeeTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffeeTimeLayout.createSequentialGroup()
                .addComponent(coffePic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coffeTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coffeTime)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        trattoriaBtn.setBackground(new java.awt.Color(243, 244, 255));
        trattoriaBtn.setRoundBottomLeft(30);
        trattoriaBtn.setRoundBottomRight(30);
        trattoriaBtn.setRoundTopLeft(30);
        trattoriaBtn.setRoundTopRight(30);

        trattoriaPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/italian.png"))); // NOI18N

        trattoriaTitle.setFont(new java.awt.Font("Nunito Medium", 1, 12)); // NOI18N
        trattoriaTitle.setText("Le Trattoria");

        trattoriaTime.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        trattoriaTime.setForeground(new java.awt.Color(153, 153, 153));
        trattoriaTime.setText("30-40 min     ");

        javax.swing.GroupLayout trattoriaBtnLayout = new javax.swing.GroupLayout(trattoriaBtn);
        trattoriaBtn.setLayout(trattoriaBtnLayout);
        trattoriaBtnLayout.setHorizontalGroup(
            trattoriaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trattoriaPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(trattoriaBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trattoriaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trattoriaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trattoriaTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trattoriaBtnLayout.setVerticalGroup(
            trattoriaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trattoriaBtnLayout.createSequentialGroup()
                .addComponent(trattoriaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trattoriaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trattoriaTime)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundRestLayout = new javax.swing.GroupLayout(backgroundRest);
        backgroundRest.setLayout(backgroundRestLayout);
        backgroundRestLayout.setHorizontalGroup(
            backgroundRestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundRestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundRestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundRestLayout.createSequentialGroup()
                        .addComponent(sushiHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mexicanPalace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(burgersAndPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundRestLayout.createSequentialGroup()
                        .addComponent(shawarmaQueen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(coffeeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trattoriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 169, Short.MAX_VALUE))
        );
        backgroundRestLayout.setVerticalGroup(
            backgroundRestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundRestLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(backgroundRestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sushiHouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mexicanPalace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burgersAndPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(backgroundRestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coffeeTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shawarmaQueen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trattoriaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1394, Short.MAX_VALUE))
        );

        scrollRestaurants.setViewportView(backgroundRest);

        dealBurgers.setBackground(new java.awt.Color(255, 243, 237));
        dealBurgers.setRoundBottomLeft(20);
        dealBurgers.setRoundBottomRight(20);
        dealBurgers.setRoundTopLeft(20);
        dealBurgers.setRoundTopRight(20);

        dealBig.setFont(new java.awt.Font("Nunito SemiBold", 0, 14)); // NOI18N
        dealBig.setText("Big Burgers");

        discountBurger.setFont(new java.awt.Font("Nunito ExtraBold", 0, 24)); // NOI18N
        discountBurger.setForeground(new java.awt.Color(253, 109, 34));
        discountBurger.setText("50% OFF");

        couponB.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        couponB.setForeground(new java.awt.Color(204, 204, 204));
        couponB.setText("Foodies");

        burgersPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/burger.png"))); // NOI18N

        javax.swing.GroupLayout dealBurgersLayout = new javax.swing.GroupLayout(dealBurgers);
        dealBurgers.setLayout(dealBurgersLayout);
        dealBurgersLayout.setHorizontalGroup(
            dealBurgersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealBurgersLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(burgersPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(dealBurgersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discountBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealBig)
                    .addComponent(couponB))
                .addGap(18, 18, 18))
        );
        dealBurgersLayout.setVerticalGroup(
            dealBurgersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dealBurgersLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(dealBig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discountBurger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(couponB)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealBurgersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(burgersPic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dealDessert.setBackground(new java.awt.Color(243, 244, 255));
        dealDessert.setRoundBottomLeft(20);
        dealDessert.setRoundBottomRight(20);
        dealDessert.setRoundTopLeft(20);
        dealDessert.setRoundTopRight(20);

        allDesserts.setFont(new java.awt.Font("Nunito SemiBold", 0, 14)); // NOI18N
        allDesserts.setText("All deserts");

        dessertDiscount.setFont(new java.awt.Font("Nunito ExtraBold", 0, 24)); // NOI18N
        dessertDiscount.setForeground(new java.awt.Color(78, 96, 255));
        dessertDiscount.setText("20% OFF");

        coupon.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        coupon.setForeground(new java.awt.Color(204, 204, 204));
        coupon.setText("Deserty");

        cupcake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cupcake.png"))); // NOI18N

        javax.swing.GroupLayout dealDessertLayout = new javax.swing.GroupLayout(dealDessert);
        dealDessert.setLayout(dealDessertLayout);
        dealDessertLayout.setHorizontalGroup(
            dealDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealDessertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(dealDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dessertDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allDesserts)
                    .addComponent(coupon))
                .addGap(18, 18, 18))
        );
        dealDessertLayout.setVerticalGroup(
            dealDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dealDessertLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(allDesserts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dessertDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coupon)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealDessertLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nearbyTxt)
                        .addComponent(scrollRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dealDessert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dealBurgers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealBurgers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealDessert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(nearbyTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allDesserts;
    private javax.swing.JPanel backgroundRest;
    private javax.swing.JLabel burgerPic;
    private javax.swing.JLabel burgerTime;
    private javax.swing.JLabel burgerTitle;
    private View.PanelRound burgersAndPizza;
    private javax.swing.JLabel burgersPic;
    private javax.swing.JLabel coffePic;
    private javax.swing.JLabel coffeTime;
    private javax.swing.JLabel coffeTitle;
    private View.PanelRound coffeeTime;
    private javax.swing.JLabel coupon;
    private javax.swing.JLabel couponB;
    private javax.swing.JLabel cupcake;
    private javax.swing.JLabel dealBig;
    private View.PanelRound dealBurgers;
    private View.PanelRound dealDessert;
    private javax.swing.JLabel dessertDiscount;
    private javax.swing.JLabel discountBurger;
    private javax.swing.JLabel mexPic;
    private javax.swing.JLabel mexTime;
    private javax.swing.JLabel mexTitle;
    private View.PanelRound mexicanPalace;
    private javax.swing.JLabel nearbyTxt;
    private javax.swing.JScrollPane scrollRestaurants;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel shawarmaPic;
    private View.PanelRound shawarmaQueen;
    private javax.swing.JLabel shawarmaTime;
    private javax.swing.JLabel shawarmaTitle;
    private View.PanelRound sushiHouse;
    private javax.swing.JLabel sushiPic;
    private javax.swing.JLabel sushiTime;
    private javax.swing.JLabel sushiTitle;
    private View.PanelRound trattoriaBtn;
    private javax.swing.JLabel trattoriaPic;
    private javax.swing.JLabel trattoriaTime;
    private javax.swing.JLabel trattoriaTitle;
    // End of variables declaration//GEN-END:variables
}
