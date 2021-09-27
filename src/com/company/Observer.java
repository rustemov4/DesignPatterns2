package com.company;

import java.util.HashMap;

public interface Observer {
     void notifyKilled(String name, HashMap<String,Player> players);
}
