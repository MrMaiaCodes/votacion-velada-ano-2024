package com.veladaano.programandoenjava.votacionveladaano2024.services.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class VoteControl {

    private Map<String, Long> usersLatestVote = new HashMap<>();

    public boolean allowVote(String user) {
        long now = System.currentTimeMillis();
        if(usersLatestVote.containsKey(user)) {
            long latestVote = usersLatestVote.get(user);
            if(now - latestVote < 1000) {
                return false;
            }
        }
        usersLatestVote.put(user, now);
        return true;
    }
}
