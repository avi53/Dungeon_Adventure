package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.OverlayLayout;

public class GamePlayPanel extends JPanel {

    // constants

    /** . */
    private static final int MINIMUM_HEALTH_SIZE = 0;
    /** . */
    private static final int MAXIMUM_HEALTH_SIZE = 100;
    /** . */
    private static final int CHARACTER_MOVEMENT_BTN_WIDTH = 100;
    /** . */
    private static final int CHARACTER_MOVEMENT_BTN_HEIGHT = 100;
    /** . */
    private static final int CHARACTER_PANEL_AND_HEALTH_BAR_WIDTH = 500;
    /** . */
    private static final int CHARACTER_PANEL_HEIGHT = 500;
    /** . */
    private static final int CHARACTER_PANEL_AND_HEALTH_BAR_X_COORDINATE = 390;
    /** . */
    private static final int CHARACTER_PANEL_Y_COORDINATE = 110;
    /** . */
    private static final int HEALTH_BAR_Y_COORDINATE = 620;
    /** . */
    private static final int HEALTH_BAR_HEIGHT = 40;
    /** . */
    private static final int MINI_MAP_WIDTH = 200;
    /** . */
    private static final int MINI_MAP_HEIGHT = 200;
    /** . */
    private static final int MINI_MAP_X_COORDINATE = 30;
    /** . */
    private static final int MINI_MAP_Y_COORDINATE = 25;
    /** . */
    private static final int SAVE_AND_INVENTORY_BUTTON_WIDTH = 100;
    /** . */
    private static final int SAVE_AND_INVENTORY_BUTTON_HEIGHT = 40;
    /** . */
    private static final int SAVE_BUTTON_X_COORDINATE = 145;
    /** . */
    private static final int INVENTORY_X_COORDINATE = 1035;
    /** . */
    private static final int SAVE_AND_INVENTORY_Y_COORDINATE = 620;

    // instance fields

    /** . */
    private JPanel myMiniMap;
    /** . */
    private JPanel myCharacterAndMovementOptions;
    /** . */
    private JLabel myHeroJPGLabel;
    /** . */
    private JLabel myGameBGLabel;
    /** . */
    private JButton myNorthBtn;
    /** . */
    private JButton mySouthBtn;
    /** . */
    private JButton myEastBtn;
    /** . */
    private JButton myWestBtn;
    /** . */
    private JProgressBar myCharactersHealth;
    /** . */
    private JButton myInventoryBtn;
    /** . */
    private JButton mySaveGameBtn;


    // constructor

    /** . */
    public GamePlayPanel() {
        instantiateInstanceDataFields();
        setUpThisPanelsLayoutAndAddBGImg();
        setCharacterButtonsPreferredSize();
        addButtonsAndHeroImageToCharacterAndMovementPanel();
        setUpHeroHealthBar();
        setUpMiniMapAndItsBounds();
        setUpSaveAndInventoryButtonBounds();
        addAllTheComponentsToGameBGLabel();
    }


    // methods

    /** . */
    private void instantiateInstanceDataFields() {
        final ImageIcon heroImg = new ImageIcon("src/imgs/TEST_HERO_SPRITE2.jpg");
        final ImageIcon gamePlayBGImg = new ImageIcon("src/imgs/MainGameImg1.jpg");
        myMiniMap = new JPanel();
        myCharacterAndMovementOptions = new JPanel();
        myHeroJPGLabel = new JLabel(heroImg);
        myGameBGLabel = new JLabel(gamePlayBGImg);
        myNorthBtn = new JButton("Move North");
        mySouthBtn = new JButton("Move South");
        myEastBtn = new JButton("Move East");
        myWestBtn = new JButton("Move West");
        myCharactersHealth = new JProgressBar(MINIMUM_HEALTH_SIZE, MAXIMUM_HEALTH_SIZE);
        myInventoryBtn = new JButton("Inventory");
        mySaveGameBtn = new JButton("Save Game");
    }

    /** . */
    private void setUpThisPanelsLayoutAndAddBGImg() {
        this.setLayout(new OverlayLayout(this));
        this.add(myGameBGLabel);
    }


    /** . */
    private void setCharacterButtonsPreferredSize() {
        myNorthBtn.setPreferredSize(new Dimension(CHARACTER_MOVEMENT_BTN_WIDTH,
                                    CHARACTER_MOVEMENT_BTN_HEIGHT));
        mySouthBtn.setPreferredSize(new Dimension(CHARACTER_MOVEMENT_BTN_WIDTH,
                                    CHARACTER_MOVEMENT_BTN_HEIGHT));
        myEastBtn.setPreferredSize(new Dimension(CHARACTER_MOVEMENT_BTN_WIDTH,
                                    CHARACTER_MOVEMENT_BTN_HEIGHT));
        myWestBtn.setPreferredSize(new Dimension(CHARACTER_MOVEMENT_BTN_WIDTH,
                                    CHARACTER_MOVEMENT_BTN_HEIGHT));
    }

    /** . */
    private void addButtonsAndHeroImageToCharacterAndMovementPanel() {
        myCharacterAndMovementOptions.setLayout(new BorderLayout());
        myCharacterAndMovementOptions.add(myHeroJPGLabel, BorderLayout.CENTER);
        myCharacterAndMovementOptions.add(myNorthBtn, BorderLayout.NORTH);
        myCharacterAndMovementOptions.add(mySouthBtn, BorderLayout.SOUTH);
        myCharacterAndMovementOptions.add(myEastBtn, BorderLayout.EAST);
        myCharacterAndMovementOptions.add(myWestBtn, BorderLayout.WEST);
        myCharacterAndMovementOptions.setBounds(CHARACTER_PANEL_AND_HEALTH_BAR_X_COORDINATE,
                                                CHARACTER_PANEL_Y_COORDINATE,
                                                CHARACTER_PANEL_AND_HEALTH_BAR_WIDTH,
                                                CHARACTER_PANEL_HEIGHT);
    }

    /** . */
    private void setUpHeroHealthBar() {
        myCharactersHealth.setValue(MAXIMUM_HEALTH_SIZE);
        myCharactersHealth.setBounds(CHARACTER_PANEL_AND_HEALTH_BAR_X_COORDINATE,
                                     HEALTH_BAR_Y_COORDINATE,
                                     CHARACTER_PANEL_AND_HEALTH_BAR_WIDTH,
                                     HEALTH_BAR_HEIGHT);
        myCharactersHealth.setForeground(Color.RED);
        myCharactersHealth.setBackground(Color.GRAY);
        myCharactersHealth.setString("Health");
        myCharactersHealth.setStringPainted(true);
    }

    /** . */
    private void setUpMiniMapAndItsBounds() {
        myMiniMap.setBounds(MINI_MAP_X_COORDINATE, MINI_MAP_Y_COORDINATE,
                            MINI_MAP_WIDTH, MINI_MAP_HEIGHT);
        myMiniMap.setBackground(Color.PINK);
    }

    /** . */
    private void setUpSaveAndInventoryButtonBounds() {
        mySaveGameBtn.setBounds(SAVE_BUTTON_X_COORDINATE,
                                SAVE_AND_INVENTORY_Y_COORDINATE,
                                SAVE_AND_INVENTORY_BUTTON_WIDTH,
                                SAVE_AND_INVENTORY_BUTTON_HEIGHT);
        myInventoryBtn.setBounds(INVENTORY_X_COORDINATE,
                                 SAVE_AND_INVENTORY_Y_COORDINATE,
                                 SAVE_AND_INVENTORY_BUTTON_WIDTH,
                                 SAVE_AND_INVENTORY_BUTTON_HEIGHT);
    }

    /** . */
    private void addAllTheComponentsToGameBGLabel() {
        myGameBGLabel.add(myCharacterAndMovementOptions);
        myGameBGLabel.add(myCharactersHealth);
        myGameBGLabel.add(myMiniMap);
        myGameBGLabel.add(myInventoryBtn);
        myGameBGLabel.add(mySaveGameBtn);
    }


}
