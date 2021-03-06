package AEU.AVC.SUQ.engine;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import AEU.OCI.AVC.SUQ.estimation.C.RatioMap;
import AEU.OEI.AVC.SUQ.SVU.EOP.E.RatioMap_E;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
//import OCI.ME.analysis.C.A;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import SVQ.stable.StableString;
public class EnvironmentInit{
	public EmotionMap getEmotionMap() {
		return emotionMap;
	}

	public void I_EmotionMap(EmotionMap emotionMap) {
		this.emotionMap = emotionMap;
	}

	public A get_A() {
		return _A;
	}

	public void I__A(CogsBinaryForest_AE _A) {
		this._A = _A;
	}

	public Map<String, Object> getPositive() {
		return positive;
	}

	public void I_Positive(Map<String, Object> positive) {
		this.positive = positive;
	}

	public Map<String, Object> getNegative() {
		return negative;
	}

	public void I_Negative(Map<String, Object> negative) {
		this.negative = negative;
	}

	public Map<String, Object> getMotivation() {
		return motivation;
	}

	public void I_Motivation(Map<String, Object> motivation) {
		this.motivation = motivation;
	}

	public Map<String, Object> getTrending() {
		return trending;
	}

	public void I_Trending(Map<String, Object> trending) {
		this.trending = trending;
	}

	public Map<String, Object> getPrediction() {
		return prediction;
	}

	public void I_Prediction(Map<String, Object> prediction) {
		this.prediction = prediction;
	}

	public List<String> getSets() {
		return sets;
	}

	public void I_Sets(List<String> sets) {
		this.sets = sets;
	}

	public RatioMap getRationMap() {
		return rationMap;
	}

	public void I_RationMap(RatioMap rationMap) {
		this.rationMap = rationMap;
	}

	public Map<Integer, WordFrequency> getWordFrequencyMap() {
		return wordFrequencyMap;
	}

	public void I_WordFrequencyMap(Map<Integer, WordFrequency> wordFrequencyMap) {
		this.wordFrequencyMap = wordFrequencyMap;
	}

	public Map<String, EmotionSample> getEmotionSampleMap() {
		return emotionSampleMap;
	}

	public void I_EmotionSampleMap(Map<String, EmotionSample> emotionSampleMap) {
		this.emotionSampleMap = emotionSampleMap;
	}

	public double getPositiveCount() {
		return positiveCount;
	}

	public void I_PositiveCount(double positiveCount) {
		this.positiveCount = positiveCount;
	}

	public double getNegativeCount() {
		return negativeCount;
	}

	public void I_NegativeCount(double negativeCount) {
		this.negativeCount = negativeCount;
	}

	public double getTotalCount() {
		return totalCount;
	}

	public void I_TotalCount(double totalCount) {
		this.totalCount = totalCount;
	}

	public Map<String, Object> getDistinction() {
		return distinction;
	}

	public void I_Distinction(Map<String, Object> distinction) {
		this.distinction = distinction;
	}
	private EmotionMap emotionMap;
	private CogsBinaryForest_AE _A;
	private Map<String, Object> positive;
	private Map<String, Object> negative;
	private Map<String, Object> motivation;
	private Map<String, Object> trending;
	private Map<String, Object> prediction;
	private Map<String, Object> distinction;
	private List<String> sets;
	private RatioMap rationMap;
	private Map<Integer, WordFrequency> wordFrequencyMap;
	private Map<String, EmotionSample> emotionSampleMap;
	private double positiveCount;
	private double negativeCount;
	private double totalCount;
	@SuppressWarnings("unused")
	public static void main(String[] argv) throws IOException {
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.IV_(StableString.text1);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
	}

	public void IV_(String text) throws IOException {
		emotionMap = new EmotionMap_E(); 
		emotionMap.IV_MotivationMap();
		emotionMap.IV_TrendingMap();
		emotionMap.IV_PredictionMap();
		emotionMap.IV_DistinctionMap();
		_A = new CogsBinaryForest_AE();
		_A.IV_();
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		sets = _A.parserString(text);
		wordFrequencyMap = _A.getWordFrequencyByReturnSortMap(sets);
		rationMap = new RatioMap_E();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(wordFrequencyMap);
		rationMap.IQ_Motivation(emotionSampleMap, motivation);
		rationMap.IQ_Trending(emotionSampleMap, trending);
		rationMap.IQ_Prediction(emotionSampleMap, prediction);
		rationMap.IQ_Distinction(emotionSampleMap, distinction);
	}
	
	public void IV_Exclude_A(String text, CogsBinaryForest_AE _AInput) throws IOException {
		emotionMap = new EmotionMap_E(); 
		emotionMap.IV_MotivationMap();
		emotionMap.IV_TrendingMap();
		emotionMap.IV_PredictionMap();
		emotionMap.IV_DistinctionMap();
		_A = _AInput;
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		sets = _AInput.parserString(text);
		wordFrequencyMap = _AInput.getWordFrequencyByReturnSortMap(sets);
		rationMap = new RatioMap_E();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(wordFrequencyMap);
		rationMap.IQ_Motivation(emotionSampleMap, motivation);
		rationMap.IQ_Trending(emotionSampleMap, trending);
		rationMap.IQ_Prediction(emotionSampleMap, prediction);
		rationMap.IQ_Distinction(emotionSampleMap, distinction);
	}
	
	public void IV_FromEmotion(Map<Integer, WordFrequency> getWordFrequencyMap) throws IOException {
		emotionMap = new EmotionMap_E(); 
		emotionMap.IV_MotivationMap();
		emotionMap.IV_TrendingMap();
		emotionMap.IV_PredictionMap();
		emotionMap.IV_DistinctionMap();
		//parser sentence
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		//map
		rationMap = new RatioMap_E();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(getWordFrequencyMap);
		rationMap.IQ_Motivation(emotionSampleMap, motivation);
		rationMap.IQ_Trending(emotionSampleMap, trending);
		rationMap.IQ_Prediction(emotionSampleMap, prediction);
		rationMap.IQ_Distinction(emotionSampleMap, distinction);
	}
	
	public void IV_FromEmotionExcludeEmotion(Map<Integer, WordFrequency> getWordFrequencyMap, EmotionMap emotionMapInput) throws IOException {
		emotionMap = emotionMapInput;
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		rationMap = new RatioMap_E();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(getWordFrequencyMap);
		rationMap.IQ_Motivation(emotionSampleMap, motivation);
		rationMap.IQ_Trending(emotionSampleMap, trending);
		rationMap.IQ_Prediction(emotionSampleMap, prediction);
		rationMap.IQ_Distinction(emotionSampleMap, distinction);
	}
	
}