package com.formagio.board;

import java.sql.Connection;

import com.formagio.board.persistence.migration.MigrationStrategy;
import com.formagio.board.ui.MainMenu;

import static com.formagio.board.persistence.config.ConnectionConfig.getConnection;

public class App {
    public static void main(String[] args) {
        
        try (Connection connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
            new MainMenu(connection).execute();
            System.out.println("done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
