package com.bradhawkins.monopoly.BoardSpaces;

import com.bradhawkins.monopoly.BoardSpaces.Interfaces.IBoardSpace;
import com.bradhawkins.monopoly.ReturnItems.Interfaces.IStatusResult;

/**
 * Created by bradl_000 on 12/5/2016.
 */
public class Property implements IBoardSpace {

    private String _name;
    public String GetName() {
        return _name;
    }

    public int _location;
    public int Location() {
        return 0;
    }

    public IStatusResult StatusCheck() {
        return null;
    }

    public Property(String name, int location) {
        _name = name;
        _location = location;
    }
}
