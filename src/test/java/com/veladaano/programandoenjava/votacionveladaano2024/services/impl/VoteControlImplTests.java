package com.veladaano.programandoenjava.votacionveladaano2024.services.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoteControlImplTests {

    @Test
    public void testAllowVoteTrue() {

        VoteControlImpl voteControl = new VoteControlImpl();
        boolean result = voteControl.allowVote("user1");
        assertTrue(result);
    }


}
