package mx.edu.utez.talenting.converter;

import com.google.gson.Gson;
import jakarta.persistence.AttributeConverter;
import mx.edu.utez.talenting.model.profile.CandidateProfile;

public class CandidateProfileConverter implements AttributeConverter<CandidateProfile, String> {
    @Override
    public String convertToDatabaseColumn(CandidateProfile candidateProfile) {
        return new Gson().toJson(candidateProfile);
    }

    @Override
    public CandidateProfile convertToEntityAttribute(String s) {
        return new Gson().fromJson(s, CandidateProfile.class);
    }
}
