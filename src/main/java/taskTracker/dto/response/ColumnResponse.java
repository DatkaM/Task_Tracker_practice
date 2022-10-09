package taskTracker.dto.response;

import lombok.Getter;
import lombok.Setter;
import taskTracker.dto.request.BoardRequest;
import taskTracker.dto.request.CardRequest;

import java.util.List;

@Getter
@Setter
public class ColumnResponse {

    private String title;
    private boolean isArchive;
    private List<CardResponse> cardResponses;
    private BoardResponse boardResponse;
}
