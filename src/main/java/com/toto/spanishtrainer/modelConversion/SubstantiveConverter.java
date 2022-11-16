package com.toto.spanishtrainer.modelConversion;

import com.toto.spanishtrainer.persistenceModel.Substantive;
import com.toto.spanishtrainer.serviceModel.SubstantiveForCreate;
import com.toto.spanishtrainer.serviceModel.SubstantiveForDisplay;
import com.toto.spanishtrainer.serviceModel.SubstantiveForUpdate;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Component
public class SubstantiveConverter {

    public SubstantiveForDisplay toSubstantiveForDisplay(@NotNull Substantive substantive){
        SubstantiveForDisplay substantiveForDisplay = new SubstantiveForDisplay();
        substantiveForDisplay.setId(substantive.getId());
        substantiveForDisplay.setGerman(substantive.getGerman());
        substantiveForDisplay.setSpanish(substantive.getSpanish());
        substantiveForDisplay.setWrongAnswers(substantive.getWrongAnswers());
        substantiveForDisplay.setCorrectAnswers(substantive.getCorrectAnswers());

        return substantiveForDisplay;
    }

    public List<SubstantiveForDisplay> toSubstantiveForDisplay(@NotNull List<Substantive> substantives){
        List<SubstantiveForDisplay> resultList = new ArrayList<>();

        for (Substantive substantive : substantives) {
            resultList.add(toSubstantiveForDisplay(substantive));
        }

        return resultList;
    }

    public Substantive toSubstantive(@NotNull SubstantiveForCreate substantiveForCreate){
        Substantive substantive = new Substantive();
        substantive.setId(UUID.randomUUID());
        substantive.setGerman(substantiveForCreate.getGerman());
        substantive.setSpanish(substantiveForCreate.getSpanish());
        substantive.setCorrectAnswers(0);
        substantive.setWrongAnswers(0);

        return substantive;
    }

    public Substantive toSubstantive(@NotNull SubstantiveForUpdate substantiveForUpdate, @NotNull UUID id){
        Substantive substantive = new Substantive();
        substantive.setId(id);
        substantive.setGerman(substantiveForUpdate.getGerman());
        substantive.setSpanish(substantiveForUpdate.getSpanish());
        substantive.setCorrectAnswers(substantiveForUpdate.getCorrectAnswers());
        substantive.setWrongAnswers(substantive.getWrongAnswers());

        return substantive;
    }
}
