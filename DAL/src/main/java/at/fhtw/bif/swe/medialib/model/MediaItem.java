package at.fhtw.bif.swe.medialib.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaItem implements Serializable {
    private int id;
    private String name;
    private double duration;
    private String content;

    @Override
    public String toString() {
        return name;
    }
}
