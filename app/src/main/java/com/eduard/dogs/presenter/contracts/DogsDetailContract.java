package com.eduard.dogs.presenter.contracts;

import com.eduard.dogs.base.BasePresenter;

import java.util.List;

public interface DogsDetailContract {

    interface View extends BasePresenter.View{

        void setBreedDetail(List<String> imgList);
    }

    interface Presenter{

        void getImageDetail(String name , String subname);
    }
}
