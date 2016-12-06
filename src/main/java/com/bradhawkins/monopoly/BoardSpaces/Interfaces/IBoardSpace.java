package com.bradhawkins.monopoly.BoardSpaces.Interfaces;

import com.bradhawkins.monopoly.ReturnItems.Interfaces.IStatusResult;

/**
 * Created by bradl_000 on 12/5/2016.
 */
public interface IBoardSpace {
    String GetName();
    int Location();
    IStatusResult StatusCheck();
}
