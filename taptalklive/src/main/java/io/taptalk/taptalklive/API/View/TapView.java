package io.taptalk.taptalklive.API.View;


import io.taptalk.taptalklive.API.Model.ResponseModel.TAPErrorModel;

public interface TapView<T> {
    void startLoading();

    void startLoading(String localID);

    void endLoading();

    void endLoading(String localID);

    void onEmpty(String message);

    void onSuccess(T t);

    void onSuccess(T t, String localID);

    void onSuccessMessage(String message);

    void onError(TAPErrorModel error);

    void onError(TAPErrorModel error, String localID);

    void onError(String errorMessage);

    void onError(String errorMessage, String localID);

    void onError(Throwable throwable);

    void onError(Throwable throwable, String localID);
}
