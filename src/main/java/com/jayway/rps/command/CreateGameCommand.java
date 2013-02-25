package com.jayway.rps.command;

import java.util.UUID;

import com.jayway.es.api.Command;
import com.jayway.rps.Move;

public class CreateGameCommand implements Command {
	public final UUID gameId;
	public final UUID playerId;
	public final Move move;
	
	public CreateGameCommand(UUID gameId, UUID playerId, Move move) {
		this.gameId = gameId;
		this.playerId = playerId;
		this.move = move;
	}

	@Override
	public UUID entityId() {
		return gameId;
	}
	
}
