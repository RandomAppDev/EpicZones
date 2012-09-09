/*

This file is part of EpicZones

Copyright (C) 2011 by Team ESO

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

 */

/**
 * @author jblaske@gmail.com
 * @license MIT License
 */

package com.randomappdev.EpicZones.modules.spout.listeners;

import com.randomappdev.EpicZones.modules.spout.spoutManager;
import com.randomappdev.EpicZones.utilities.Log;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerEvents implements Listener
{

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event)
    {
        try        //TODO: Make sure this works for player teleport
        {
            if (!event.isCancelled())
            {
                spoutManager.UpdatePlayerXYZ(event.getPlayer());
            }
        } catch (Exception e)
        {
            Log.write(" SPOUT MODULE " + e.getMessage());
        }
    }

//    @EventHandler
//    public void onPlayerTeleport(PlayerTeleportEvent event)
//    {
//        try
//        {
//            if (!event.isCancelled())
//            {
//                if (!Globals.PlayerMovementLogic(event.getPlayer(), event.getFrom(), event.getTo()))
//                {
//                    event.setTo(Globals.getPlayer(event.getPlayer().getName()).getCurrentLocation());
//                    event.setCancelled(true);
//                }
//            }
//        } catch (Exception e)
//        {
//            Log.write(e.getMessage());
//        }
//    }


}